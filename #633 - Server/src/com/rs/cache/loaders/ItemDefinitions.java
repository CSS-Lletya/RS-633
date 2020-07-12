package com.rs.cache.loaders;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import com.alex.utils.Constants;
import com.rs.cache.Cache;
import com.rs.game.item.Item;
import com.rs.game.player.CombatDefinitions;
import com.rs.game.player.Equipment;
import com.rs.game.player.Skills;
import com.rs.io.InputStream;
import com.rs.utils.AttackSpeeds;
import com.rs.utils.EquipData;
import com.rs.utils.ItemBonuses;

@SuppressWarnings("unused")
public final class ItemDefinitions {

	private static final ConcurrentHashMap<Integer, ItemDefinitions> itemsDefinitions = new ConcurrentHashMap<Integer, ItemDefinitions>();

	public int id;
	public boolean loaded;

	public int modelId;
	public String name;

	// model size information
	public int modelZoom;
	public int modelRotation1;
	public int modelRotation2;
	public int modelOffset1;
	public int modelOffset2;

	// extra information
	public int stackable;
	public int value;
	public boolean membersOnly;

	// wearing model information
	public int maleEquip1;
	public int femaleEquip1;
	public int maleEquip2;
	public int femaleEquip2;

	// options
	public String[] groundOptions;
	public String[] inventoryOptions;

	// model information
	public int[] originalModelColors;
	public int[] modifiedModelColors;
	public short[] originalTextureColors;
	public short[] modifiedTextureColors;
	public byte[] unknownArray1;
	public byte[] unknownArray3;
	public int[] unknownArray2;
	// extra information, not used for newer items
	public boolean unnoted;

	public int maleEquipModelId3;
	public int femaleEquipModelId3;
	public int unknownInt1;
	public int unknownInt2;
	public int unknownInt3;
	public int unknownInt4;
	public int unknownInt5;
	public int unknownInt6;
	public int certId;
	public int certTemplateId;
	public int[] stackIds;
	public int[] stackAmounts;
	public int unknownInt7;
	public int unknownInt8;
	public int unknownInt9;
	public int unknownInt10;
	public int unknownInt11;
	public int teamId;
	public int lendId;
	public int lendTemplateId;
	public int unknownInt12;
	public int unknownInt13;
	public int unknownInt14;
	public int unknownInt15;
	public int unknownInt16;
	public int unknownInt17;
	public int unknownInt18;
	public int unknownInt19;
	public int unknownInt20;
	public int unknownInt21;
	public int unknownInt22;
	public int unknownInt23;

	// Extra added from higher caches.
	public int equipSlot;
	public int equipType;

	// extra added
	public boolean noted;
	public boolean lended;

	public HashMap<Integer, Object> clientScriptData;
	public HashMap<Integer, Integer> itemRequiriments;
	public int[] unknownArray5;
	public int[] unknownArray4;
	public byte[] unknownArray6;

	public static final ItemDefinitions getItemDefinitions(int itemId) {
		ItemDefinitions def = itemsDefinitions.get(itemId);
		if (def == null)
			itemsDefinitions.put(itemId, def = new ItemDefinitions(itemId));
		return def;
	}

	public static final void clearItemsDefinitions() {
		itemsDefinitions.clear();
	}

	public ItemDefinitions(int id) {
		this.id = id;
		setDefaultsVariableValues();
		setDefaultOptions();
		loadItemDefinitions();
	}

	public boolean isLoaded() {
		return loaded;
	}

	public final void loadItemDefinitions() {
		byte[] data = Cache.STORE.getIndexes()[Constants.ITEM_DEFINITIONS_INDEX]
				.getFile(getArchiveId(), getFileId());
		if (data == null) {
			// System.out.println("Failed loading Item " + id+".");
			return;
		}
		readOpcodeValues(new InputStream(data));
		if (certTemplateId != -1)
			toNote();
		if (lendTemplateId != -1)
			toLend();
		if (unknownValue1 != -1)
			toBind();
		loaded = true;
	}

	public void toNote() {
		// ItemDefinitions noteItem; //certTemplateId
		ItemDefinitions realItem = getItemDefinitions(certId);
		membersOnly = realItem.membersOnly;
		value = realItem.value;
		name = realItem.name;
		stackable = 1;
		noted = true;
		clientScriptData = realItem.clientScriptData;
	}

	public void toBind() {
		// ItemDefinitions lendItem; //lendTemplateId
		ItemDefinitions realItem = getItemDefinitions(unknownValue2);
		originalModelColors = realItem.originalModelColors;
		maleEquipModelId3 = realItem.maleEquipModelId3;
		femaleEquipModelId3 = realItem.femaleEquipModelId3;
		teamId = realItem.teamId;
		value = 0;
		membersOnly = realItem.membersOnly;
		name = realItem.name;
		inventoryOptions = new String[5];
		groundOptions = realItem.groundOptions;
		if (realItem.inventoryOptions != null)
			for (int optionIndex = 0; optionIndex < 4; optionIndex++)
				inventoryOptions[optionIndex] = realItem.inventoryOptions[optionIndex];
		inventoryOptions[4] = "Discard";
		maleEquip1 = realItem.maleEquip1;
		maleEquip2 = realItem.maleEquip2;
		femaleEquip1 = realItem.femaleEquip1;
		femaleEquip2 = realItem.femaleEquip2;
		clientScriptData = realItem.clientScriptData;
		equipSlot = realItem.equipSlot;
		equipType = realItem.equipType;
	}

	public void toLend() {
		// ItemDefinitions lendItem; //lendTemplateId
		ItemDefinitions realItem = getItemDefinitions(lendId);
		originalModelColors = realItem.originalModelColors;
		maleEquipModelId3 = realItem.maleEquipModelId3;
		femaleEquipModelId3 = realItem.femaleEquipModelId3;
		teamId = realItem.teamId;
		value = 0;
		membersOnly = realItem.membersOnly;
		name = realItem.name;
		inventoryOptions = new String[5];
		groundOptions = realItem.groundOptions;
		if (realItem.inventoryOptions != null)
			for (int optionIndex = 0; optionIndex < 4; optionIndex++)
				inventoryOptions[optionIndex] = realItem.inventoryOptions[optionIndex];
		inventoryOptions[4] = "Discard";
		maleEquip1 = realItem.maleEquip1;
		maleEquip2 = realItem.maleEquip2;
		femaleEquip1 = realItem.femaleEquip1;
		femaleEquip2 = realItem.femaleEquip2;
		clientScriptData = realItem.clientScriptData;
		equipSlot = realItem.equipSlot;
		equipType = realItem.equipType;
		lended = true;
	}

	public int getArchiveId() {
		return getId() >>> 8;
	}

	public int getFileId() {
		return 0xff & getId();
	}

	public boolean isDestroyItem() {
		if (inventoryOptions == null)
			return false;
		for (String option : inventoryOptions) {
			if (option == null)
				continue;
			if (option.equalsIgnoreCase("destroy"))
				return true;
		}
		return false;
	}

	public boolean containsOption(int i, String option) {
		if (inventoryOptions == null || inventoryOptions[i] == null
				|| inventoryOptions.length <= i)
			return false;
		return inventoryOptions[i].equals(option);
	}

	public boolean containsOption(String option) {
		if (inventoryOptions == null)
			return false;
		for (String o : inventoryOptions) {
			if (o == null || !o.equals(option))
				continue;
			return true;
		}
		return false;
	}

	public boolean isWearItem() {
		return equipSlot != -1;
	}

	public boolean isWearItem(boolean male) {
		if (equipSlot < Equipment.SLOT_RING
				&& (male ? getMaleWornModelId1() == -1
						: getFemaleWornModelId1() == -1))
			return false;

		if (!containsInventoryOption(1, "Wield")
				&& !containsInventoryOption(1, "Wear")) {
			return false;
		}
		return equipSlot != -1;
	}

	public boolean containsInventoryOption(int i, String option) {
		if (inventoryOptions == null || inventoryOptions[i] == null
				|| inventoryOptions.length <= i)
			return false;
		return inventoryOptions[i].equals(option);
	}

	public int getStageOnDeath() {
		if (clientScriptData == null)
			return 0;
		Object protectedOnDeath = clientScriptData.get(1397);
		if (protectedOnDeath != null && protectedOnDeath instanceof Integer)
			return (Integer) protectedOnDeath;
		return 0;
	}

	public boolean hasSpecialBar() {
		if (clientScriptData == null)
			return false;
		Object specialBar = clientScriptData.get(686);
		if (specialBar != null && specialBar instanceof Integer)
			return (Integer) specialBar == 1;
		return false;
	}

	public int getAttackSpeed() {
		return AttackSpeeds.getAttackSpeed(id);
	}

	public int getStabAttack() {
		if (id > 22322 || ItemBonuses.getItemBonuses(id) == null)
			return 0;
		int value = ItemBonuses.getItemBonuses(id)[CombatDefinitions.STAB_ATTACK];
		return value;
	}

	public int getSlashAttack() {
		if (id > 22322 || ItemBonuses.getItemBonuses(id) == null)
			return 0;
		int value = ItemBonuses.getItemBonuses(id)[CombatDefinitions.SLASH_ATTACK];
		return value;
	}

	public int getCrushAttack() {
		if (id > 22322 || ItemBonuses.getItemBonuses(id) == null)
			return 0;
		int value = ItemBonuses.getItemBonuses(id)[CombatDefinitions.CRUSH_ATTACK];
		return value;
	}

	public int getMagicAttack() {
		if (id > 22322 || ItemBonuses.getItemBonuses(id) == null)
			return 0;
		int value = ItemBonuses.getItemBonuses(id)[CombatDefinitions.MAGIC_ATTACK];
		return value;
	}

	public int getRangeAttack() {
		if (id > 22322 || ItemBonuses.getItemBonuses(id) == null)
			return 0;
		int value = ItemBonuses.getItemBonuses(id)[CombatDefinitions.RANGE_ATTACK];
		return value;
	}

	public int getStabDef() {
		if (id > 22322 || ItemBonuses.getItemBonuses(id) == null)
			return 0;
		int value = ItemBonuses.getItemBonuses(id)[CombatDefinitions.STAB_DEF];
		return value;
	}

	public int getSlashDef() {
		if (id > 22322 || ItemBonuses.getItemBonuses(id) == null)
			return 0;
		int value = ItemBonuses.getItemBonuses(id)[CombatDefinitions.SLASH_DEF];
		return value;
	}

	public int getCrushDef() {
		if (id > 22322 || ItemBonuses.getItemBonuses(id) == null)
			return 0;
		int value = ItemBonuses.getItemBonuses(id)[CombatDefinitions.CRUSH_DEF];
		return value;
	}

	public int getMagicDef() {
		if (id > 22322 || ItemBonuses.getItemBonuses(id) == null)
			return 0;
		int value = ItemBonuses.getItemBonuses(id)[CombatDefinitions.MAGIC_DEF];
		return value;
	}

	public int getRangeDef() {
		if (id > 22322 || ItemBonuses.getItemBonuses(id) == null)
			return 0;
		int value = ItemBonuses.getItemBonuses(id)[CombatDefinitions.RANGE_DEF];
		return value;
	}

	public int getSummoningDef() {
		if (id > 22322 || ItemBonuses.getItemBonuses(id) == null)
			return 0;
		int value = ItemBonuses.getItemBonuses(id)[CombatDefinitions.SUMMONING_DEF];
		return value;
	}

	public int getStrengthBonus() {
		if (id > 22322 || ItemBonuses.getItemBonuses(id) == null)
			return 0;
		int value = ItemBonuses.getItemBonuses(id)[CombatDefinitions.STRENGTH_BONUS];
		return value;
	}

	public int getRangedStrBonus() {
		if (id > 22322 || ItemBonuses.getItemBonuses(id) == null)
			return 0;
		int value = ItemBonuses.getItemBonuses(id)[CombatDefinitions.RANGED_STR_BONUS];
		return value;
	}

	public int getMagicDamage() {
		if (id > 22322 || ItemBonuses.getItemBonuses(id) == null)
			return 0;
		int value = ItemBonuses.getItemBonuses(id)[CombatDefinitions.MAGIC_DAMAGE];
		return value;
	}

	public int getPrayerBonus() {
		if (id > 22322 || ItemBonuses.getItemBonuses(id) == null)
			return 0;
		int value = ItemBonuses.getItemBonuses(id)[CombatDefinitions.PRAYER_BONUS];
		return value;
	}

	public int getAbsorptionMeleeBonus() {
		if (id > 22322 || ItemBonuses.getItemBonuses(id) == null)
			return 0;
		int value = ItemBonuses.getItemBonuses(id)[CombatDefinitions.ABSORB_MELEE];
		return value;
	}

	public int getAbsorptionMageBonus() {
		if (id > 22322 || ItemBonuses.getItemBonuses(id) == null)
			return 0;
		int value = ItemBonuses.getItemBonuses(id)[CombatDefinitions.ABSORB_MAGIC];
		return value;
	}

	public int getAbsorptionRangeBonus() {
		if (id > 22322 || ItemBonuses.getItemBonuses(id) == null)
			return 0;
		int value = ItemBonuses.getItemBonuses(id)[CombatDefinitions.ABSORB_RANGE];
		return value;
	}

	public int getRenderAnimId() {
		if (clientScriptData == null)
			return 1426;
		Object animId = clientScriptData.get(644);
		if (animId != null && animId instanceof Integer)
			return (Integer) animId;
		return 1426;
	}

	public boolean hasShopPriceAttributes() {
		if (clientScriptData == null)
			return false;
		if (clientScriptData.get(258) != null
				&& ((Integer) clientScriptData.get(258)).intValue() == 1)
			return true;
		if (clientScriptData.get(259) != null
				&& ((Integer) clientScriptData.get(259)).intValue() == 1)
			return true;
		return false;
	}

	public int getModelZoom() {
		return modelZoom;
	}

	public int getModelOffset1() {
		return modelOffset1;
	}

	public int getModelOffset2() {
		return modelOffset2;
	}

	public int getQuestId() {
		if (clientScriptData == null)
			return -1;
		Object questId = clientScriptData.get(861);
		if (questId != null && questId instanceof Integer)
			return (Integer) questId;
		return -1;
	}

	public List<Item> getCreateItemRequirements(boolean infusingScroll) {
		if (clientScriptData == null)
			return null;
		List<Item> items = new ArrayList<Item>();
		int requiredId = -1;
		int requiredAmount = -1;
		for (int key : clientScriptData.keySet()) {
			Object value = clientScriptData.get(key);
			if (value instanceof String)
				continue;
			if (key >= 536 && key <= 770) {
				if (key % 2 == 0)
					requiredId = (Integer) value;
				else
					requiredAmount = (Integer) value;
				if (requiredId != -1 && requiredAmount != -1) {
					if (infusingScroll) {
						requiredId = getId();
						requiredAmount = 1;
					}
					if (items.size() == 0 && !infusingScroll)
						items.add(new Item(requiredAmount, 1));
					else
						items.add(new Item(requiredId, requiredAmount));
					requiredId = -1;
					requiredAmount = -1;
					if (infusingScroll) {
						break;
					}
				}
			}
		}
		return items;
	}

	public HashMap<Integer, Object> getClientScriptData() {
		return clientScriptData;
	}

	public HashMap<Integer, Integer> getWearingSkillRequiriments() {
		if (clientScriptData == null)
			return null;
		if (itemRequiriments == null) {
			HashMap<Integer, Integer> skills = new HashMap<Integer, Integer>();
			for (int i = 0; i < 10; i++) {
				Integer skill = (Integer) clientScriptData.get(749 + (i * 2));
				if (skill != null) {
					Integer level = (Integer) clientScriptData
							.get(750 + (i * 2));
					if (level != null)
						skills.put(skill, level);
				}
			}
			Integer maxedSkill = (Integer) clientScriptData.get(277);
			if (maxedSkill != null)
				skills.put(maxedSkill, getId() == 19709 ? 120 : 99);
			itemRequiriments = skills;
			if (getId() == 7462)
				itemRequiriments.put(Skills.DEFENCE, 40);
			else if (getId() == 19784 || getId() == 22401 || getId() == 19780) { // Korasi
				itemRequiriments.put(Skills.ATTACK, 78);
				itemRequiriments.put(Skills.STRENGTH, 78);
			} else if (getId() == 20822 || getId() == 20823 || getId() == 20824
					|| getId() == 20825 || getId() == 20826)
				itemRequiriments.put(Skills.DEFENCE, 99);
			else if (name.equals("Dragon defender")) {
				itemRequiriments.put(Skills.ATTACK, 60);
				itemRequiriments.put(Skills.DEFENCE, 60);
			}
		}
		return itemRequiriments;
	}

	public void setDefaultOptions() {
		groundOptions = new String[] { null, null, "take", null, null };
		inventoryOptions = new String[] { null, null, null, null, "drop" };
	}

	public void setDefaultsVariableValues() {
		name = "null";
		maleEquip1 = -1;
		maleEquip2 = -1;
		femaleEquip1 = -1;
		femaleEquip2 = -1;
		modelZoom = 2000;
		lendId = -1;
		lendTemplateId = -1;
		certId = -1;
		certTemplateId = -1;
		unknownInt9 = 128;
		value = 1;
		maleEquipModelId3 = -1;
		femaleEquipModelId3 = -1;
		unknownValue1 = -1;
		unknownValue2 = -1;
		teamId = -1;
		equipSlot = -1;
		equipType = -1;
	}

	private final void readValues(InputStream stream, int opcode) {
		if (EquipData.canEquip(id) && equipSlot == -1) {
			equipSlot = EquipData.getEquipSlot(id);
			if (EquipData.getEquipType(id) > -1)
				equipType = EquipData.getEquipType(id);
		}
		if (opcode == 1)
			modelId = stream.readUnsignedShort();
		else if (opcode == 2)
			name = stream.readString();
		else if (opcode == 4)
			modelZoom = stream.readUnsignedShort();
		else if (opcode == 5)
			modelRotation1 = stream.readUnsignedShort();
		else if (opcode == 6)
			modelRotation2 = stream.readUnsignedShort();
		else if (opcode == 7) {
			modelOffset1 = stream.readUnsignedShort();
			if (modelOffset1 > 32767)
				modelOffset1 -= 65536;
			modelOffset1 <<= 0;
		} else if (opcode == 8) {
			modelOffset2 = stream.readUnsignedShort();
			if (modelOffset2 > 32767)
				modelOffset2 -= 65536;
			modelOffset2 <<= 0;
		} else if (opcode == 11)
			stackable = 1;
		else if (opcode == 12)
			value = stream.readInt();
		else if (opcode == 16)
			membersOnly = true;
		else if (opcode == 23)
			maleEquip1 = stream.readUnsignedShort();
		else if (opcode == 24)
			maleEquip2 = stream.readUnsignedShort();
		else if (opcode == 25)
			femaleEquip1 = stream.readUnsignedShort();
		else if (opcode == 26)
			femaleEquip2 = stream.readUnsignedShort();
		else if (opcode >= 30 && opcode < 35)
			groundOptions[opcode - 30] = stream.readString();
		else if (opcode >= 35 && opcode < 40)
			inventoryOptions[opcode - 35] = stream.readString();
		else if (opcode == 40) {
			int length = stream.readUnsignedByte();
			originalModelColors = new int[length];
			modifiedModelColors = new int[length];
			for (int index = 0; index < length; index++) {
				originalModelColors[index] = stream.readUnsignedShort();
				modifiedModelColors[index] = stream.readUnsignedShort();
			}

		} else if (opcode == 41) {
			int length = stream.readUnsignedByte();
			originalTextureColors = new short[length];
			modifiedTextureColors = new short[length];
			for (int index = 0; index < length; index++) {
				originalTextureColors[index] = (short) stream
						.readUnsignedShort();
				modifiedTextureColors[index] = (short) stream
						.readUnsignedShort();
			}
		} else if (opcode == 42) {
			int length = stream.readUnsignedByte();
			unknownArray1 = new byte[length];
			for (int index = 0; index < length; index++)
				unknownArray1[index] = (byte) stream.readByte();
		} else if (opcode == 65)
			unnoted = true;
		else if (opcode == 78)
			maleEquipModelId3 = stream.readUnsignedShort();
		else if (opcode == 79)
			femaleEquipModelId3 = stream.readUnsignedShort();
		else if (opcode == 90)
			unknownInt1 = stream.readUnsignedShort();
		else if (opcode == 91)
			unknownInt2 = stream.readUnsignedShort();
		else if (opcode == 92)
			unknownInt3 = stream.readUnsignedShort();
		else if (opcode == 93)
			unknownInt4 = stream.readUnsignedShort();
		else if (opcode == 95)
			unknownInt5 = stream.readUnsignedShort();
		else if (opcode == 96)
			unknownInt6 = stream.readUnsignedByte();
		else if (opcode == 97)
			certId = stream.readUnsignedShort();
		else if (opcode == 98)
			certTemplateId = stream.readUnsignedShort();
		else if (opcode >= 100 && opcode < 110) {
			if (stackIds == null) {
				stackIds = new int[10];
				stackAmounts = new int[10];
			}
			stackIds[opcode - 100] = stream.readUnsignedShort();
			stackAmounts[opcode - 100] = stream.readUnsignedShort();
		} else if (opcode == 110)
			unknownInt7 = stream.readUnsignedShort();
		else if (opcode == 111)
			unknownInt8 = stream.readUnsignedShort();
		else if (opcode == 112)
			unknownInt9 = stream.readUnsignedShort();
		else if (opcode == 113)
			unknownInt10 = stream.readByte();
		else if (opcode == 114)
			unknownInt11 = stream.readByte() * 5;
		else if (opcode == 115)
			teamId = stream.readUnsignedByte();
		else if (opcode == 121)
			lendId = stream.readUnsignedShort();
		else if (opcode == 122)
			lendTemplateId = stream.readUnsignedShort();
		else if (opcode == 125) {
			unknownInt12 = stream.readByte() << 0;
			unknownInt13 = stream.readByte() << 0;
			unknownInt14 = stream.readByte() << 0;
		} else if (opcode == 126) {
			unknownInt15 = stream.readByte() << 0;
			unknownInt16 = stream.readByte() << 0;
			unknownInt17 = stream.readByte() << 0;
		} else if (opcode == 127) {
			unknownInt18 = stream.readUnsignedByte();
			unknownInt19 = stream.readUnsignedShort();
		} else if (opcode == 128) {
			unknownInt20 = stream.readUnsignedByte();
			unknownInt21 = stream.readUnsignedShort();
		} else if (opcode == 129) {
			unknownInt20 = stream.readUnsignedByte();
			unknownInt21 = stream.readUnsignedShort();
		} else if (opcode == 130) {
			unknownInt22 = stream.readUnsignedByte();
			unknownInt23 = stream.readUnsignedShort();
		} else if (opcode == 132) {
			int length = stream.readUnsignedByte();
			unknownArray2 = new int[length];
			for (int index = 0; index < length; index++)
				unknownArray2[index] = stream.readUnsignedShort();
		} else if (opcode == 139) {
			int unknownValue = stream.readUnsignedShort();
		} else if (opcode == 140) {
			int unknownValue = stream.readUnsignedShort();
		} else if (opcode == 249) {
			int length = stream.readUnsignedByte();
			if (clientScriptData == null)
				clientScriptData = new HashMap<Integer, Object>(length);
			for (int index = 0; index < length; index++) {
				boolean stringInstance = stream.readUnsignedByte() == 1;
				int key = stream.read24BitInt();
				Object value = stringInstance ? stream.readString() : stream
						.readInt();
				clientScriptData.put(key, value);
			}
		} else
			throw new RuntimeException("MISSING OPCODE " + opcode
					+ " FOR ITEM " + id);
	}

	public int unknownValue1;
	public int unknownValue2;

	public final void readOpcodeValues(InputStream stream) {
		while (true) {
			int opcode = stream.readUnsignedByte();
			if (opcode == 0)
				break;
			readValues(stream, opcode);
		}
	}

	public String getName() {
		return name;
	}

	public int getFemaleWornModelId1() {
		return femaleEquip1;
	}

	public int getFemaleWornModelId2() {
		return femaleEquip2;
	}

	public int getMaleWornModelId1() {
		return maleEquip1;
	}

	public int getMaleWornModelId2() {
		return maleEquip2;
	}

	public boolean isOverSized() {
		return modelZoom > 5000;
	}

	public boolean isLended() {
		return lended;
	}

	public boolean isMembersOnly() {
		return membersOnly;
	}

	public boolean isStackable() {
		return stackable == 1;
	}

	public boolean isNoted() {
		return noted;
	}

	public int getLendId() {
		return lendId;
	}

	public int getCertId() {
		return certId;
	}

	public int getValue() {
		return value;
	}

	public int getId() {
		return id;
	}

	public int getEquipSlot() {
		return equipSlot;
	}

	public int getEquipType() {
		return equipType;
	}
}