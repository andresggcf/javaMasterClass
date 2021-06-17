package Section5.challenge;

public class SumDigits {

  public static void mainMethod (){
    System.out.println(sumDigits(525245));
    System.out.println(isPalindrome(-121));
    System.out.println(sumFirstAndLastDigit(65234));
    System.out.println(getEvenDigitSum(132984));

    //Parsing string values to an int
    String numberAsString = "2020";
    System.out.println("number as string = " + numberAsString);

    int number = Integer.parseInt(numberAsString);
    System.out.println(numberAsString + 20);
    System.out.println(number + 20);
  }

  public static int sumDigits (int number){

    if (number < 10)
      return -1;

    int result = 0;

    while (number > 0) {
      int digit = number % 10;
      result += digit;
      number /= 10;
    }
    return result;
  }

  public static boolean isPalindrome(int number) {
    boolean isPal = false;

    if (number < 0)
      number *= -1;

    int numberTest = number;
    int reverse = 0;

    while (numberTest > 0) {
      int digit = numberTest % 10;
      reverse += digit;
      reverse *= 10;
      numberTest /= 10;
    }
    reverse /= 10;

    if (reverse == number){
      isPal = true;
    }
    return isPal;
  }

  public static int sumFirstAndLastDigit (int number) {
    if (number < 0)
      return -1;

    int lastDigit = number % 10;
    int firstDigit = 0;

    while (number > 0){
      firstDigit = number % 10;
      number /= 10;
    }
    return firstDigit + lastDigit;
  }

  public static int getEvenDigitSum(int number){
    if (number < 0)
      return -1;

    int sum = 0;
    int digit = 0;

    while (number > 0){
      digit = number % 10;
      if (digit % 2 == 0)
        sum += digit;
      number /= 10;
    }

    return sum;
  }
}
