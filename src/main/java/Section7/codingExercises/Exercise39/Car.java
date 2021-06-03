package Section7.codingExercises.Exercise39;

public class Car {
  private boolean engine;
  private int cylinders;
  private String name;
  private int wheels;

  public Car(int cylinders, String name) {
    this.name = name;
    this.wheels = 4;
    this.engine = true;
    this.cylinders = cylinders;
  }

  public String startEngine () {
    return "Car -> startEngine()";
  }

  public String accelerate () {
    return "Car -> accelerate()";
  }

  public String brake() {
    return "Car -> brake()";
  }

  public String getName() {
    return name;
  }

  public int getCylinders() {
    return cylinders;
  }
}
