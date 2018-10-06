package maps;

import terrain.Wall;

public class LoadMap {

	public static void testMa(Map m) {
		m.walls.add(new Wall(78, 7, 217, 121));
		m.walls.add(new Wall(7, 78, 122, 217));
		m.walls.add(new Wall(7, 79, 384, 217));
		m.walls.add(new Wall(78, 7, 217, 384));
		m.walls.add(new Wall(64, 8, 160, 216));
		m.walls.add(new Wall(8, 56, 216, 160));
		m.walls.add(new Wall(64, 8, 288, 216));
		m.walls.add(new Wall(8, 56, 288, 160));
		m.walls.add(new Wall(8, 64, 216, 288));
		m.walls.add(new Wall(56, 8, 160, 288));
		m.walls.add(new Wall(8, 64, 288, 288));
		//TODO add walls at the edge of the map
	}
	
}
