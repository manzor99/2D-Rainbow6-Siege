import java.util.ArrayList;

public abstract Gun{
  int damage, fireRate, magSize, bulletsInMag;
  ArrayList<Attachment> attachments;

  public Gun(int damage, int fireRate, int magSize, int bulletsInMag, ArrayList<Attachment> attachments){
    this.damage = damamge;
    this.fireRate = fireRate;
    this.bulletsInMag = bulletsInMag;
    this.attachments = attachments;
  }
}
