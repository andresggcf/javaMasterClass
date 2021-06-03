package Section7.challenge.polymorphism;

public class Holden extends Car {

  public Holden(String name, int cylinders) {
    super(name, cylinders);
  }

  @Override
  public String startEngine() {
    return getClass().getSimpleName() + " -> Start Engine";   //gets de name of the class
  }

  @Override
  public void accelerate(int speed) {
    System.out.println("Holden -> accelerate");
    super.accelerate(speed);
  }

  @Override
  public void brake(int speed) {
    System.out.println("Holden -> brake");
    int carSpeed = super.getSpeed();
    if(speed > carSpeed){
      super.setSpeed(0);
    } else {
      super.setSpeed(carSpeed - speed);
    }
    System.out.println("Holden -> brake to " + super.getSpeed() + " kmph");
  }
}
