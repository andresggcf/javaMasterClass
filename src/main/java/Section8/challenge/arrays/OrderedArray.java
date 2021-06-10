package Section8.challenge.arrays;

import java.util.Scanner;

public class OrderedArray {
  private Scanner scanner = new Scanner(System.in);

  public int[] getIntegers(int number){
    System.out.println("Enter " + number + " integer: ");
    int[] values = new int[number];
    for(int i = 0; i < values.length; i++){
      values[i] = scanner.nextInt();
    }
    return values;
  }

  public void printArray(int[] array){
    for (int i = 0; i < array.length; i++){
      System.out.println("Array element " + i + " value: " + array[i]);
    }
  }

  public int[] sortArray(int[] array){
    for (int i = 0; i < array.length-1; i++){
      for (int j = i+1; j < array.length; j++){
        int number1 = array[i];
        int number2 = array[j];
        if(number1 < number2){
         array[i] = number2;
         array[j] = number1;
       }
      }
    }
    return array;
  }
}
