package maps;

import java.awt.Dimension;

import javax.swing.JLabel;

public class Wall extends Terrain{

	boolean reinforced;
	final int width, height, x, y;
	JLabel label;
	
	public Wall(int width, int height, int x, int y) {
		this.width = width;
		this.height = height;
		this.x = x;
		this.y = y;
		this.label = new JLabel();
		this.label.setSize(new Dimension(width, height));
	}
	
}
