package Section5.lectures;

import java.util.Scanner;


public class UserInput {
  public static void mainMethod(){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter name: ");
    String name = scanner.nextLine();

    System.out.println("Enter your YOB: ");
    int yearOfBirth = scanner.nextInt();
    scanner.nextLine();

    System.out.println("your name is " + name);
    System.out.println("Age: " + (2020 - yearOfBirth));

    int sum = 0;

    for (int i= 0; i < 10; i++){
      System.out.println("Enter number no. " + (i + 1));
      if(scanner.hasNextInt()) {
        int number = scanner.nextInt();
        scanner.nextLine();
        sum += number;
      }
      else
        System.out.println("Invalid number");
    }

    System.out.println(sum);
  }
}
