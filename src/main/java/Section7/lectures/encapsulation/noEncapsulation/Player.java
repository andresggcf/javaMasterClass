package Section7.lectures.encapsulation.noEncapsulation;

public class Player {
  public String name;   //public is being used because we're accessing them in name
  public int health;
  public String weapon;

  public void loseHealth(int damage){
    this.health = this.health - damage;
    if (this.health <= 0){
      this.health = 0;
      System.out.println("Player dead");
    }
  }

  public int getHealth() {
    return this.health;
  }
}
