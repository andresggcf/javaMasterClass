package Section7.challenge.polymorphism;

public class Ford extends Car {

  public Ford(String name, int cylinders) {
    super(name, cylinders);
  }

  @Override
  public String startEngine() {
    return "Ford -> Start Engine";
  }

  @Override
  public void accelerate(int speed) {
    System.out.println("Ford -> accelerate");
    super.accelerate(speed);
  }

  @Override
  public void brake(int speed) {
    System.out.println("Ford -> brake");
    super.brake(speed);
  }
}
