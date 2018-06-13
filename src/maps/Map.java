package maps;

import java.awt.Canvas;
import java.util.ArrayList;
import terrain.Stairs;
import terrain.Wall;
import terrain.Window;

public class Map extends Canvas{
  public int width, height;
  public ArrayList<Wall> walls;
  public ArrayList<Window> windows;
  public ArrayList<Stairs> stairs;
  
  public Map() {
	  walls = new ArrayList<>();
	  windows = new ArrayList<>();
	  stairs = new ArrayList<>();
  }
}
