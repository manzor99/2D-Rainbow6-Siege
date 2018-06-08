package characters;

import java.awt.Rectangle;

import javax.swing.JLabel;

import guns.Gun;

public abstract class Character extends Rectangle{
  public int health, speed, armor, ammo; //ammo not in mag
  public Gun gun;
  public JLabel label;
  
  public Character(int health, int speed, int armor, int ammo, int width, int height, Gun gun){
    this.health = health;
    this.speed = speed;
    this.armor = armor;
    this.ammo = ammo;
    this.width = width;
    this.height = height;
    this.gun = gun;
    this.label = new JLabel();
    this.label.setSize(width, height);
    this.label.setVisible(true);
  }
  
}
