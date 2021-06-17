package Section5.lectures;

public class SumOdds {
  public static boolean isOdd (int number) {
    if (number <= 0)
      return false;

    else return number % 2 == 1;
  }

  public static int sumOdd (int start, int end){

    if (end < start || start <= 0){
      return -1;
    }

    int sum = 0;
    for(int i = start; i <= end; i ++){
      if (isOdd(i)){
        sum += i;
      }
    }
    System.out.println("sum = " + sum);
    return sum;
  }
}
