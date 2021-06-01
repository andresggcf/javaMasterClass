package Section6.lectures.Inheritance;
/*Java normal inheritance is done with
* "extends"*/
public class Dog extends Animal {

  private int eyes;
  private int legs;
  private int tail;
  private int teeth;
  private String coat;

  public Dog(String name,
             int size,
             int weight,
             int eyes,
             int legs,
             int teeth,
             String coat) {
    /*super calls the constructor from where
    * this class is extending from*/
    super(name, 1, 1, size, weight);
    this.eyes = eyes;
    this.legs = legs;
    this.teeth = teeth;
    this.coat = coat;
  }

  private void chew() {
    System.out.println(this.getName() + " is chewing");
  }

  /**
   * Overrides eat method from the class
   * that is extending from
   */
  @Override
  public void eat(){
    chew();
    super.eat();
  }

  public void walk() {
    System.out.println( this.getName() + " is walking");
    super.move(10);
  }

  public void run() {
    System.out.println(this.getName() + " is running");
    move(20);
  }

  private void moveLegs(int speed) {
    System.out.println(this.getName() + " is moving legs");
  }

  /** Animal.move ignored and Dog will call
   * Dog.move();
   */
  @Override
  public void move(int speed) {
    System.out.println("Dog.move() called");
    moveLegs(speed);
    super.move(speed);
  }
}
