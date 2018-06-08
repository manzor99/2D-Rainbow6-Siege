package characters;

import java.awt.Color;

import javax.swing.ImageIcon;

import guns.Gun;

public class Tachanka extends Character{

	public Tachanka(int health, int speed, int armor, int ammo, int width, int height, Gun gun) {
		super(health, speed, armor, ammo, width, height, gun);
		this.label.setForeground(Color.RED);
		this.label.setIcon(new ImageIcon("C:\\Users\\R\\Documents\\GitHub\\2D-Rainbow6-Siege\\src\\resources\\TachankaF1.png"));
		// TODO Auto-generated constructor stub
	}

	
	
}
