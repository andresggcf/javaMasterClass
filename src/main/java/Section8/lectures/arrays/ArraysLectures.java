package Section8.lectures.arrays;

import java.util.Scanner;

public class ArraysLectures {
  private static Scanner scanner = new Scanner(System.in);

  public void generateArray(){
    int[] myIntArray = new int[10]; //array of 10 integers
    myIntArray[5] = 50; //assign 50 to position 5 of the array

    int[] myIntArray2 = {1,2,3,4,5,6,7,8,9,0};

    double[] myDoubleArray = new double[10];
    myDoubleArray[3] = 10.3;

    printArray(myIntArray2);
    int[] inputArray = getIntegers(5);

    System.out.println("The average of array: ");
    printArray(inputArray);
    System.out.println("is: " + getAverage(inputArray));
  }

  public void printArray(int[] array){
    for (int i = 0; i < array.length; i++){
      System.out.println("Array element " + i + " value: " + array[i]);
    }
  }

  public static int[] getIntegers(int number){
    System.out.println("Enter " + number + " integer: ");
    int[] values = new int[number];
    for(int i = 0; i < values.length; i++){
      values[i] = scanner.nextInt();
    }
    return values;
  }

  public static double getAverage(int[] array){
    int  sum = 0;
    for (int value : array) {
      sum += value;
    }
    return (double) sum / (double)array.length;
  }
}
