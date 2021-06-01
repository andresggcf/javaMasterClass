package Section6.challenge;

public class Vehicle {
  private String type;
  private String steer;
  private String move;
  private int speed;

  public Vehicle (String name, String steer, String move){
    this.type = name;
    this.steer = steer;
    this.move = move;
    this.speed = 0;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getSteer() {
    return steer;
  }

  public void setSteer(String steer) {
    this.steer = steer;
  }

  public String getMove() {
    return move;
  }

  public void setMove(String move) {
    this.move = move;
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public void increaseSpeed (int amount) {
    this.speed += amount;
    System.out.println("Increased speed by " + amount + " to " + this.speed);
  }

  public void decreaseSpeed (int amount) {
    this.speed -= amount;
    System.out.println("Decreased speed by " + amount + " to " + this.speed);
  }

  public void stop (){
    this.speed = 0;
    System.out.println("Vehicle has stopped");
  }
}
