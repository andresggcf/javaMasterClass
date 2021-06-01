package Section5.codingExcercises;

import java.util.ArrayList;
import java.util.List;

public class Divisors {

    public static int getGreatestCommonDivisor(int first, int second){
        if(first < 10 || second < 10){
            return -1;
        } else {
            List<Integer> divisors1 = getDivisorsList(first);
            List<Integer> divisors2 = getDivisorsList(second);
            int result = 1;
            for (int i = 1; i < divisors1.size(); i++) {
                for (int j = 1; j < divisors2.size(); j++) {
                    if (divisors1.get(i).equals(divisors2.get(j))) {
                        result = divisors1.get(i);
                        break;
                    }
                }
            }
            return result;
        }
    }

    static List<Integer> getDivisorsList (int number){
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= number; i ++){
            if (number % i == 0){
                result.add(i);
            }
        }
        return result;
    }

    static List<Integer> getExcludeDivisorsList (int number){
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i < number; i ++){
            if (number % i == 0){
                result.add(i);
            }
        }
        return result;
    }

    public static void printFactors (int number){
        if (number < 1){
            System.out.println("Invalid Value");
        } else {
            List<Integer> divisors = getDivisorsList(number);
            for (Integer divisor : divisors) {
                System.out.println(divisor);
            }
        }
    }

    public static boolean isPerfectNumber (int number){
        if (number < 1){
            return false;
        } else {
            List<Integer> divisors = getExcludeDivisorsList(number);
            int result = 0;
            for (Integer divisor : divisors) {
                result += divisor;
            }
            return result == number;
        }
    }
}
