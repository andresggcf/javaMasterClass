package Section8.exercises.exercise42;

import java.util.Scanner;

public class MinimumElementExercise {

  public int readInteger(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter number of integers: ");
    int numbers = scanner.nextInt();
    scanner.nextLine();

    return numbers;
  }

  public int[] readElements(int number){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter " + number + " integers: ");
    int[] values = new int[number];
    for(int i = 0; i < values.length; i++){
      values[i] = scanner.nextInt();
    }
    return values;
  }

  public int findMin(int[] array) {
    int min = Integer.MAX_VALUE;
    for (int value : array) {
      if (value < min) {
        min = value;
      }
    }
    return min;
  }
}
