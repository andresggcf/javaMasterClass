package Section6.challenge;

public class Car extends Vehicle {
  private String gearbox;
  private int gear;
  private int wheels;

  public Car(String gearbox) {
    super("car", "wheel", "ground");
    this.gearbox = gearbox;
    this.wheels = 4;
    this.gear = 0;
  }

  public String getGearbox() {
    return gearbox;
  }

  public void setGearbox(String gearbox) {
    this.gearbox = gearbox;
  }

  public int getWheels() {
    return wheels;
  }

  public void setWheels(int wheels) {
    this.wheels = wheels;
  }

  public int getGear() {
    return gear;
  }

  public void setGear(int gear) {
    this.gear = gear;
  }

  @Override
  public void stop () {
    super.stop();
    System.out.println("Car has stopped.");
  }

  public void changeGear(int gear) {
    this.gear = gear;
    System.out.println("Changed gear to " + gear + " gear.");
  }
}
