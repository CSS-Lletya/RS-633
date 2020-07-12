package com.rs.cache.loaders;

import java.io.IOException;

import com.rs.cache.Cache;
import com.rs.game.WorldTile;

public class WorldMap {

    public static void main(String[] args) throws IOException {
	Cache.init();
	WorldTile tile = new WorldTile(60303008);
	System.out.println(tile.getX() + "," + tile.getY() + ", " + tile.getPlane());
	System.out.println(Cache.STORE.getIndexes()[23].getFileId(Cache.STORE.getIndexes()[23].getArchiveId("details"), "troll_stronghold"));
	System.out.println(Cache.STORE.getIndexes()[23].getArchiveId("troll_stronghold_staticelements"));
	System.out.println(Cache.STORE.getIndexes()[23].getFileId(Cache.STORE.getIndexes()[23].getArchiveId("troll_stronghold"), "area"));
	System.out.println(Cache.STORE.getIndexes()[23].getValidFilesCount(Cache.STORE.getIndexes()[23].getArchiveId("troll_stronghold")));
    }

    public static int getDetailsArchiveId() {
	return Cache.STORE.getIndexes()[23].getArchiveId("details");
    }

}
