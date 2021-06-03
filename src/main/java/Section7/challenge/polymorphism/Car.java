package Section7.challenge.polymorphism;

public class Car {
  private String name;
  private boolean engine;
  private int cylinders;
  private int wheels;
  private int speed;

  public Car(String name, int cylinders) {
    this.name = name;
    this.wheels = 4;
    this.engine = true;
    this.cylinders = cylinders;
    this.speed = 0;
  }

  public String startEngine () {
    return "Car -> Start Engine";
  }

  public void accelerate (int speed) {
    this.speed += speed;
    System.out.println("Car -> accelerated to " + this.speed + " kmph");
  }

  public void brake(int speed) {
    this.speed -= speed;
    System.out.println("Car -> brake to " + this.speed + " kmph");
  }

  public String getName() {
    return name;
  }

  public int getCylinders() {
    return cylinders;
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }
}
