package Section6.codingExercises;

public class SimpleCalculator {
    // write your code here
    private double firstNumber;
    private double secondNumber;

    public void setFirstNumber (double number) {
        this.firstNumber = number;
    }

    public double getFirstNumber () {
        return this.firstNumber;
    }

    public void setSecondNumber (double number) {
        this.secondNumber = number;
    }

    public double getSecondNumber () {
        return this.secondNumber;
    }

    public double getAdditionResult (){
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult (){
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult (){
        return firstNumber * secondNumber;
    }

    public double getDivisionResult (){
        if (secondNumber == 0) {
            return 0;
        } else {
            return firstNumber / secondNumber;
        }
    }

    public static class Wall {
      private double width;
      private double height;

      public Wall (double width, double height) {
        if (width < 0){
          this.width = 0;
        }
        if (height < 0) {
          this.height = 0;
        }
        if (width > 0){
          this.width = width;
        }
        if (height > 0){
          this.height = height;
        }
      }

      public Wall () {
        this (0,0);
      }

      public double getWidth() {
        return width;
      }

      public void setWidth(double width) {
        if (width < 0) {
          this.width = 0;
        } else {
          this.width = width;
        }
      }

      public double getHeight() {
        return height;
      }

      public void setHeight(double height) {
        if (height < 0) {
          this.height = 0;
        } else {
          this.height = height;
        }
      }

      public double getArea (){
        return this.width * this.height;
      }
    }
}