package Section6.lectures.Inheritance;

public class Fish extends Animal {

  private int gills;
  private int eyes;
  private int fins;


  /**
   * Constructor class
   * @param name
   * @param size
   * @param weight
   * @param gills
   * @param eyes
   * @param fins
   */
  public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
    super(name, 1, 1, size, weight);
    this.gills = gills;
    this.eyes = eyes;
    this.fins = fins;
  }

  private void rest() {

  }

  private void moveMuscles() {
    System.out.println("Fish is moving muscles");
  }

  private void moveBackFin() {
    System.out.println("Fish is moving back fin");
  }

  public void swim (int speed) {
    moveMuscles();
    moveBackFin();
    super.move(15);
  }
}
