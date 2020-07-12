package com.rs.game.npc;

import java.util.ArrayList;
import java.util.List;

import com.rs.cache.loaders.ItemDefinitions;
import com.rs.utils.Utils;

public class Drops {

    public static final int ALWAYS = 0, COMMOM = 1, UNCOMMON = 2, RARE = 3, VERY_RARE = 4;
    //100% always, 100% commum, 75% uncommum, 2% rare, 1% very rare
    public static final double[] DROP_RATES = { 100.0, 100.0, 75.0, 2.0,  1.0 };
    public static final int[] CHARMS = { 12158, 12159, 12160, 12163 };
    public static final Drop[] RARE_DROP_TABLE = { new Drop(1623, 1, 1), new Drop(1621, 1, 1), new Drop(1619, 1, 1), new Drop(1617, 1, 1), new Drop(1453, 1, 1), new Drop(1462, 1, 1), new Drop(987, 1, 1), new Drop(985, 1, 1), new Drop(995, 250, 1200), new Drop(1247, 1, 1), new Drop(830, 5, 5), new Drop(1201, 1, 1), new Drop(1319, 1, 1), new Drop(1373, 1, 1), new Drop(2366, 1, 1), new Drop(1249, 1, 1), new Drop(1149, 1, 1), new Drop(563, 45, 45), new Drop(563, 5, 50), new Drop(561, 47, 77), new Drop(566, 20, 20), new Drop(565, 50, 50), new Drop(892, 150, 150), new Drop(443, 100, 100), new Drop(995, 250, 1200) // again
    , new Drop(1215, 1, 1), new Drop(892, 150, 500) // again
    , new Drop(9143, 200, 200), new Drop(533, 151, 500), new Drop(2999, 25, 250), new Drop(258, 33, 33), new Drop(3001, 30, 120), new Drop(270, 10, 100), new Drop(454, 150, 7500), new Drop(450, 150, 800), new Drop(7937, 100, 14500), new Drop(1441, 25, 35), new Drop(1443, 25, 36), new Drop(1444, 1, 1), new Drop(372, 125, 1000), new Drop(383, 250, 500), new Drop(5321, 3, 3), new Drop(1631, 1, 1), new Drop(1615, 1, 1), new Drop(1391, 200, 200), new Drop(574, 1000, 1000), new Drop(570, 1000, 1000), new Drop(451, 1, 100), new Drop(2362, 1450, 7000), new Drop(2364, 1, 150), new Drop(5315, 1, 50), new Drop(5316, 1, 6), new Drop(5289, 10, 10), new Drop(5304, 1, 31), new Drop(5300, 1, 1), new Drop(1515, 100, 4500), new Drop(21620, 4, 4), new Drop(9342, 150, 150), new Drop(1216, 50, 50), new Drop(20667, 1, 1), new Drop(6686, 250, 250) };

    private boolean acessRareTable;
    private Drop[][] drops;
    private Drop[][] gearRareDrops;

    public Drops(boolean acessRareTable) {
	this.acessRareTable = acessRareTable;
	drops = new Drop[VERY_RARE + 1][];
	gearRareDrops = new Drop[VERY_RARE - RARE + 1][];

    }

    public List<Drop> generateDrops(double e) {
	List<Drop> d = new ArrayList<Drop>();
	if (drops[ALWAYS] != null) {
	    for (Drop drop : drops[ALWAYS])
		d.add(drop);
	}
	for (int i = COMMOM; i <= VERY_RARE; i++) {
	    Drop drop = getDrop(i, e);
	    if (drop != null)
		d.add(drop);
	}
	if (acessRareTable && Utils.random((int) (2000 / e)) == 0) // TODO ring of
							      // wealth reduce
							      // it by half
	    d.add(getRareDropTable());
	return d;
    }

    public void addCharms(List<Drop> d, int size) {
	if (!d.isEmpty() && Utils.random(8/size) == 0)
	    d.add(new Drop(CHARMS[Utils.random(CHARMS.length)], 1, size));
    }

    public Drop getRareDropTable() {
	return RARE_DROP_TABLE[Utils.random(RARE_DROP_TABLE.length)];
    }
    
    
    public Drop getDrop(int rarity, double e) {
	if(rarity >= RARE) {
		if(gearRareDrops[rarity-RARE] != null && gearRareDrops[rarity-RARE].length != 0 && Math.random()*100 <= (DROP_RATES[rarity] * e)) 
		    return gearRareDrops[rarity-RARE][Utils.random(gearRareDrops[rarity-RARE].length)];
	}
	if(drops[rarity] != null && drops[rarity].length != 0 && Math.random()*100 <= (DROP_RATES[rarity] * e)) 
	    return drops[rarity][Utils.random(drops[rarity].length)];
	return null;
	/*List<Drop> d = new ArrayList<Drop>();
	for (Drop drop : drops[rarity]) {
	    if (Utils.random(DROP_RATES[rarity] / rate) == 0)
		d.add(drop);
	}
	return d.size() == 0 ? null : d.get(Utils.random(d.size()));*/
    }

    public static boolean countsAsGear(int id) {
	return id == 13754 || id == 11286 || id == 21369 || id == 13746 || id == 13748 || id == 13750 || id == 13752;
    }
     public void addDrops(List<Drop>[] dList) {
	for (int i = 0; i < dList.length; i++) {
	    if (dList[i] == null)
		continue;
	    if(i >= RARE) {
		ArrayList<Drop> cleanedGear = new ArrayList<Drop>();
		for(Drop drop : dList[i].toArray(new Drop[dList[i].size()])) { 
		    if(countsAsGear(drop.getItemId()) || ItemDefinitions.getItemDefinitions(drop.getItemId()).isWearItem()) {
			cleanedGear.add(drop);
			dList[i].remove(drop);
		    }
		}
		if(cleanedGear.size() > 0)
		    gearRareDrops[i - RARE] = cleanedGear.toArray(new Drop[cleanedGear.size()]);
	    }
	    drops[i] = dList[i].toArray(new Drop[dList[i].size()]);
	}
    }
}
