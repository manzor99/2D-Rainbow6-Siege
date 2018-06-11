package characters;

import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import guns.Gun;

public abstract class Character extends Rectangle{
  public int health, speed, armor, ammo; //ammo not in mag
  public Gun gun;
  public JLabel label;
  private ImageIcon[] up, down, left, right; //hold images for the animations
  
  public Character(int health, int speed, int armor, int width, int height, int x, int y, int ammo, Gun gun){
    this.health = health;
    this.speed = speed;
    this.armor = armor;
    this.width = width;
    this.height = height;
    this.x = x;
    this.y = y;
    this.ammo = ammo;
    this.gun = gun;
    this.label = new JLabel();
    this.label.setSize(width, height);
    this.label.setLocation(this.x, this.y);
    this.label.setVisible(true);
  }
  
  public Character() {
	  health = 100;
	  width = 32;
	  height = 32;
	  x = 100;
	  y = 100;
	  this.label = new JLabel();
	  this.label.setSize(width, height);
	  this.label.setLocation(this.x, this.y);
	  this.label.setVisible(true);
  }
  
  /*
   * move the character in a direction
   * @param the direction the character moves in
   * */
  public void move(Direction d) {
	  switch(d) {
	  	case UP:
	  		this.y -= this.speed;
	  		break;
	  	case DOWN:
	  		this.y += this.speed;
	  		break;
	  	case LEFT:
	  		this.x -= this.speed;
	  		break;
	  	case RIGHT:
	  		this.x -= this.speed;
	  		break;
	  }
  }
  
}
