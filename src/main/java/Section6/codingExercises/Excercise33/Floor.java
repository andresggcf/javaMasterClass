package Section6.codingExercises.Excercise33;

public class Floor {
  private double width;
  private double length;

  public Floor (double width, double length) {
    if (width < 0){
      this.width = 0;
    }
    if (width >= 0){
      this.width = width;
    }
    if (length < 0){
      this.length = 0;
    }
    if (length >= 0){
      this.length = length;
    }
  }

  public double getArea (){
    return this.width * this.length;
  }
}
