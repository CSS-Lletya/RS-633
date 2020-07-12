package com.rs.tools;

import java.io.IOException;

import com.rs.cache.Cache;
import com.rs.cache.loaders.NPCDefinitions;
import com.rs.utils.Utils;

public class RenderEmotes {
    public static void main(String[] args) throws IOException {
	Cache.init();
	int emoteId = 4084;
	skip:for (int i = 0; i < Cache.STORE.getIndexes()[2].getLastFileId(32)+1; i++) {
	    if(!Cache.STORE.getIndexes()[2].fileExists(32, i))
		continue;
	    for(int i2 = 0; i2 < Utils.getNPCDefinitionsSize(); i2++)
		if(NPCDefinitions.getNPCDefinitions(i2).renderEmote == i)
		    continue skip;
	    System.out.println(i);
	  /*  RenderAnimDefinitions defs = RenderAnimDefinitions.getRenderAnimDefinitions(i);
	    if (defs.defaultStandAnimation == emoteId || defs.walkAnimation == emoteId)
		System.out.println("RenderID: " + i);*/
	}
    }
}
