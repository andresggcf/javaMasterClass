package Section6.codingExercises;

public class Point {
  private int x;
  private int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public Point () {
    this(0,0);
  }

  public int getX() {
    return x;
  }

  public void setX(int x) {
    this.x = x;
  }

  public int getY() {
    return y;
  }

  public void setY(int y) {
    this.y = y;
  }

  public double distance (){
    return Math.sqrt(
        (-this.x) * (-this.x) + (-this.y) * (-this.y));
  }

  public double distance (int x, int y){
    return Math.sqrt(
        (x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
  }

  public double distance (Point pointB){
    return Math.sqrt(
        (pointB.x - this.x) * (pointB.x - this.x) + (pointB.y - this.y) * (pointB.y - this.y));
  }
}
