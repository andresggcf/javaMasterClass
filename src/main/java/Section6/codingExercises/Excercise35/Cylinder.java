package Section6.codingExercises.Excercise35;

public class Cylinder extends Circle {
  private double height;

  public Cylinder(double radius, double height) {
    super(radius);
    if (height <= 0) {
      this.height = 0;
    } else {
      this.height = height;
    }
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    if (height <= 0) {
      this.height = 0;
    } else {
      this.height = height;
    }
  }

  public double getVolume() {
    return height * getArea();
  }
}
