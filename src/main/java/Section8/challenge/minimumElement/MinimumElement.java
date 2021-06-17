package Section8.challenge.minimumElement;

import java.util.Scanner;

public class MinimumElement {
  private static Scanner scanner = new Scanner(System.in);
  public static final int MAX = Integer.MAX_VALUE;

  public int[] mainStart() {
    System.out.println("Enter number of integers: ");
    int numbers = scanner.nextInt();

    return readIntegers(numbers);
  }

  public int[] readIntegers(int number){
    System.out.println("Enter " + number + " integers: ");
    int[] values = new int[number];
    for(int i = 0; i < values.length; i++){
      values[i] = scanner.nextInt();
    }
    return values;
  }

  public int findMin(int[] array) {
    int min = MAX;
    for (int value : array) {
      if (value < min) {
        min = value;
      }
    }
    return min;
  }
}
