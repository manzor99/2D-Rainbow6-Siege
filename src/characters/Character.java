package characters;

import guns.Gun;

public abstract class Character{
  int health, speed, armor, ammo, width, height; //ammo not in mag
  Gun gun;

  public Character(int health, int speed, int armor, int ammo, int width, int height, Gun gun){
    this.health = health;
    this.speed = speed;
    this.armor = armor;
    this.ammo = ammo;
    this.width = width;
    this.height = height;
    this.gun = gun;
  }

}
