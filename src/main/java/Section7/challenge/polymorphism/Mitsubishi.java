package Section7.challenge.polymorphism;

public class Mitsubishi extends Car {

  public Mitsubishi(String name, int cylinders) {
    super(name, cylinders);
  }

  @Override
  public String startEngine() {
    return "Mitsubishi -> Start Engine";
  }

  @Override
  public void accelerate(int speed) {
    System.out.println("Mitsubishi -> accelerate");
    super.accelerate(speed);
  }

  @Override
  public void brake(int speed) {
    System.out.println("Mitsubishi -> brake");
    int carSpeed = super.getSpeed();
    if(speed > carSpeed){
      super.setSpeed(0);
    } else {
      super.setSpeed(carSpeed - speed);
    }
    System.out.println("Mitsubishi -> brake to " + super.getSpeed() + " kmph");
  }
}
