package guns;

import java.util.ArrayList;

import attachments.Attachment;

public abstract class Gun{
  int damage, fireRate, magSize, bulletsInMag;
  ArrayList<Attachment> attachments;

  public Gun(int damage, int fireRate, int magSize, int bulletsInMag, ArrayList<Attachment> attachments){
    this.damage = damage;
    this.fireRate = fireRate;
    this.bulletsInMag = bulletsInMag;
    this.attachments = attachments;
  }
}
