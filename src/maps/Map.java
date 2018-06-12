package maps;

import java.awt.Canvas;
import java.util.ArrayList;
import terrain.Stairs;
import terrain.Wall;
import terrain.Window;

public class Map extends Canvas{
  int width, height;
  ArrayList<Wall> walls;
  ArrayList<Window> windows;
  ArrayList<Stairs> stairs;
}
