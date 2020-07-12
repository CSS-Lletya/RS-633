package com.rs.game.npc.combat;

import com.rs.game.Animation;
import com.rs.game.Entity;
import com.rs.game.ForceMovement;
import com.rs.game.World;
import com.rs.game.WorldTile;
import com.rs.game.npc.NPC;
import com.rs.game.npc.familiar.Familiar;
import com.rs.game.npc.fightkiln.HarAkenTentacle;
import com.rs.game.npc.godwars.zaros.Nex;
import com.rs.game.npc.pest.PestPortal;
import com.rs.game.player.Player;
import com.rs.game.player.content.Combat;
import com.rs.utils.MapAreas;
import com.rs.utils.Utils;

public final class NPCCombat {

	private NPC npc;
	private int combatDelay;
	private Entity target;

	public NPCCombat(NPC npc) {
		this.npc = npc;
	}

	public int getCombatDelay() {
		return combatDelay;
	}

	/*
	 * returns if under combat
	 */
	public boolean process() {
		if (combatDelay > 0)
			combatDelay--;
		if (target != null) {
			if (!checkAll()) {
				removeTarget();
				return false;
			}
			if (combatDelay <= 0)
				combatDelay = combatAttack();
			return true;
		}
		return false;
	}

	/*
	 * return combatDelay
	 */
	private int combatAttack() {
		Entity target = this.target; // prevents multithread issues
		if (target == null)
			return 0;
		// if hes frooze not gonna attack
		if (npc.getFreezeDelay() >= Utils.currentTimeMillis())
			return 0;
		// check if close to target, if not let it just walk and dont attack
		// this gameticket
		NPCCombatDefinitions defs = npc.getCombatDefinitions();
		int attackStyle = defs.getAttackStyle();
		if (target instanceof Familiar && Utils.random(3) == 0) {
			Familiar familiar = (Familiar) target;
			Player player = familiar.getOwner();
			if (player != null) {
				target = player;
				npc.setTarget(target);
			}

		}
		// MAGE_FOLLOW and RANGE_FOLLOW follow close but can attack far unlike
		// melee
		int maxDistance = attackStyle == NPCCombatDefinitions.MELEE ? 0
				: npc instanceof HarAkenTentacle ? 16 : 7;
		if ((!(npc instanceof Nex))
				&& !npc.clipedProjectile(target, maxDistance == 0
						&& !forceCheckClipAsRange(target))) {
			return 0;
		}
		if (npc.hasWalkSteps())
			maxDistance += npc.getRun() ? 2 : 1;
		int size = npc.getSize();
		int targetSize = target.getSize();
		if (!Utils.isOnRange(npc.getX(), npc.getY(), size, target.getX(),
				target.getY(), targetSize, maxDistance))
			return 0;
		if (Utils.colides(npc.getX(), npc.getY(), size, target.getX(),
				target.getY(), targetSize))
			return 0;
		addAttackedByDelay(target);
		return CombatScriptsHandler.specialAttack(npc, target);
	}

	protected void doDefenceEmote(Entity target) {
		/*
		 * if (target.getNextAnimation() != null) // if has att emote already
		 * return;
		 */
		target.setNextAnimationNoPriority(new Animation(Combat
				.getDefenceEmote(target)));
	}

	public Entity getTarget() {
		return target;
	}

	public void addAttackedByDelay(Entity target) { // prevents multithread
		// issues

		target.setAttackedBy(npc);
		target.setAttackedByDelay(Utils.currentTimeMillis()
				+ npc.getCombatDefinitions().getAttackDelay() * 600 + 600); // 8seconds
	}

	public void setTarget(Entity target) {
		this.target = target;
		npc.setNextFaceEntity(target);
		if (!checkAll()) {
			removeTarget();
			return;
		}
	}

	public boolean checkAll() {
		Entity target = this.target; // prevents multithread issues
		if (target == null)
			return false;
		if (npc.isDead() || npc.hasFinished() || npc.isForceWalking()
				|| target.isDead() || target.hasFinished()
				|| npc.getPlane() != target.getPlane())
			return false;
		if (npc.getFreezeDelay() >= Utils.currentTimeMillis())
			return true; // if freeze cant move ofc
		int distanceX = npc.getX() - npc.getRespawnTile().getX();
		int distanceY = npc.getY() - npc.getRespawnTile().getY();
		int size = npc.getSize();
		int maxDistance;
		int agroRatio = npc.getCombatDefinitions().getAgroRatio();
		if (!npc.isNoDistanceCheck() && !npc.isCantFollowUnderCombat()) {
			maxDistance = agroRatio > 32 ? agroRatio : 32;
			if (!(npc instanceof Familiar)) {

				if (npc.getMapAreaNameHash() != -1) {
					// if out his area
					if (!MapAreas.isAtArea(npc.getMapAreaNameHash(), npc)
							|| (!npc.canBeAttackFromOutOfArea() && !MapAreas
									.isAtArea(npc.getMapAreaNameHash(), target))) {
						npc.forceWalkRespawnTile();
						return false;
					}
				} else if (distanceX > size + maxDistance
						|| distanceX < -1 - maxDistance
						|| distanceY > size + maxDistance
						|| distanceY < -1 - maxDistance) {
					// if more than 32 distance from respawn place
					npc.forceWalkRespawnTile();
					return false;
				}
			}
			maxDistance = agroRatio > 16 ? agroRatio : 16;
			distanceX = target.getX() - npc.getX();
			distanceY = target.getY() - npc.getY();
			if (distanceX > size + maxDistance || distanceX < -1 - maxDistance
					|| distanceY > size + maxDistance
					|| distanceY < -1 - maxDistance) {
				return false; // if target distance higher 16
			}
		} else {
			distanceX = target.getX() - npc.getX();
			distanceY = target.getY() - npc.getY();
		}
		// checks for no multi area :)
		if (npc instanceof Familiar) {
			Familiar familiar = (Familiar) npc;
			if (!familiar.canAttack(target))
				return false;
		} else {
			if (!npc.isForceMultiAttacked()) {
				if (!target.isAtMultiArea() || !npc.isAtMultiArea()) {
					if (npc.getAttackedBy() != target
							&& npc.getAttackedByDelay() > Utils
									.currentTimeMillis())
						return false;
					if (target.getAttackedBy() != npc
							&& target.getAttackedByDelay() > Utils
									.currentTimeMillis())
						return false;
				}
			}
		}
		if (!npc.isCantFollowUnderCombat()) {
			// if is under
			int targetSize = target.getSize();
			/*
			 * if (distanceX < size && distanceX > -targetSize && distanceY <
			 * size && distanceY > -targetSize && !target.hasWalkSteps()) {
			 */
			if (!target.hasWalkSteps()
					&& Utils.colides(npc.getX(), npc.getY(), size,
							target.getX(), target.getY(), targetSize)) {
				npc.resetWalkSteps();
				if (!npc.addWalkSteps(target.getX() + targetSize, npc.getY())) {
					npc.resetWalkSteps();
					if (!npc.addWalkSteps(target.getX() - size, npc.getY())) {
						npc.resetWalkSteps();
						if (!npc.addWalkSteps(npc.getX(), target.getY()
								+ targetSize)) {
							npc.resetWalkSteps();
							if (!npc.addWalkSteps(npc.getX(), target.getY()
									- size)) {
								return true;
							}
						}
					}
				}
				return true;
			}
			if (npc.getCombatDefinitions().getAttackStyle() == NPCCombatDefinitions.MELEE
					&& targetSize == 1
					&& size == 1
					&& Math.abs(npc.getX() - target.getX()) == 1
					&& Math.abs(npc.getY() - target.getY()) == 1
					&& !target.hasWalkSteps()) {
				if (!npc.addWalkSteps(target.getX(), npc.getY(), 1))
					npc.addWalkSteps(npc.getX(), target.getY(), 1);
				return true;
			}

			int attackStyle = npc.getCombatDefinitions().getAttackStyle();
			if (npc instanceof Nex) {
				Nex nex = (Nex) npc;
				maxDistance = nex.isForceFollowClose() ? 0 : 7;
				if (!nex.isFlying()
						&& (!npc.clipedProjectile(target, maxDistance == 0
								&& !forceCheckClipAsRange(target)))
						|| !Utils.isOnRange(npc.getX(), npc.getY(), size,
								target.getX(), target.getY(), targetSize,
								maxDistance)) {
					npc.resetWalkSteps();
					if (!Utils.isOnRange(npc.getX(), npc.getY(), size,
							target.getX(), target.getY(), targetSize, 10)) {
						int[][] dirs = Utils.getCoordOffsetsNear(size);
						for (int dir = 0; dir < dirs[0].length; dir++) {
							final WorldTile tile = new WorldTile(new WorldTile(
									target.getX() + dirs[0][dir], target.getY()
											+ dirs[1][dir], target.getPlane()));
							if (World.isTileFree(tile.getPlane(), tile.getX(),
									tile.getY(), size)) { // if
								// found
								// done
								npc.setNextForceMovement(new ForceMovement(
										new WorldTile(npc), 0, tile, 1, Utils
												.getMoveDirection(
														tile.getX()
																- npc.getX(),
														tile.getY()
																- npc.getY())));
								npc.setNextAnimation(new Animation(17408));
								npc.setNextWorldTile(tile);
								nex.setFlying(false);
								return true;
							}
						}
					} else
						npc.calcFollow(target, 2, true,
								npc.isIntelligentRouteFinder());
					return true;
				} else
					// if doesnt need to move more stop moving
					npc.resetWalkSteps();
			} else {
				// MAGE_FOLLOW and RANGE_FOLLOW follow close but can attack far
				// unlike melee
				maxDistance = npc.isForceFollowClose() ? 0
						: (attackStyle == NPCCombatDefinitions.MELEE
								|| attackStyle == NPCCombatDefinitions.MAGE_FOLLOW || attackStyle == NPCCombatDefinitions.RANGE_FOLLOW) ? 0
								: 7;
				npc.resetWalkSteps();
				// is far from target, moves to it till can attack
				if ((!npc.clipedProjectile(target, maxDistance == 0
						&& !forceCheckClipAsRange(target)))
						|| !Utils.isOnRange(npc.getX(), npc.getY(), size,
								target.getX(), target.getY(), targetSize,
								maxDistance)) {
					if (!npc.calcFollow(target, npc.getRun() ? 2 : 1, true,
							npc.isIntelligentRouteFinder())
							&& combatDelay < 3
							&& attackStyle == NPCCombatDefinitions.MELEE)
						combatDelay = 3;
					return true;
				}
				// if under target, moves

			}
		}
		return true;
	}

	private boolean forceCheckClipAsRange(Entity target) {
		return target instanceof PestPortal;
	}

	public void addCombatDelay(int delay) {
		combatDelay += delay;
	}

	public void setCombatDelay(int delay) {
		combatDelay = delay;
	}

	public boolean underCombat() {
		return target != null;
	}

	public void removeTarget() {
		this.target = null;
		npc.setNextFaceEntity(null);
	}

	public void reset() {
		combatDelay = 0;
		target = null;
	}

}
