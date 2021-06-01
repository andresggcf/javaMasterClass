package Section6.challenge;

public class Modena extends Car{
  private String carType;
  private int maxSpeed;
  private int doors;

  public Modena () {
    super("manual");
    this.carType = "Sport";
    this.maxSpeed = 340;
    this.doors = 2;
  }

  public String getCarType() {
    return carType;
  }

  public void setCarType(String carType) {
    this.carType = carType;
  }

  public int getMaxSpeed() {
    return maxSpeed;
  }

  public void setMaxSpeed(int maxSpeed) {
    this.maxSpeed = maxSpeed;
  }

  public int getDoors() {
    return doors;
  }

  public void setDoors(int doors) {
    this.doors = doors;
  }

  public void accelerate (int rate){
    int newVelocity = getSpeed() + rate;
    System.out.println("Speed = " + newVelocity);
    if (newVelocity == 0) {
      stop();
    } else if (newVelocity > 0 && newVelocity < 10) {
      changeGear(1);
    } else if (newVelocity >= 10 && newVelocity < 30) {
      changeGear(2);
    } else if (newVelocity >= 30 && newVelocity < 65) {
      changeGear(3);
    } else if (newVelocity >= 65 && newVelocity < 100) {
      changeGear(4);
    } else if (newVelocity >= 100 && newVelocity <= 340){
      changeGear(5);
    } else {
      System.out.println("Max speed reached");
    }
  }
}
