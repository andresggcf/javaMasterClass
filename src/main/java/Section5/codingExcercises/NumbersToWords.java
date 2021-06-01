package Section5.codingExcercises;

import java.util.ArrayList;
import java.util.List;

public class NumbersToWords {
    public static String numberToWords(int number){
        if (number < 0)
            return "Invalid Value";
        else{
            String result = "";
            List<Integer> divisorList = getDigitsList(number);
            for (int i = divisorList.size()-1; i >= 0; i--){
                switch (divisorList.get(i)){
                    case 0:
                        result += "zero";
                        break;
                    case 1:
                        result += "one";
                        break;
                    case 2:
                        result += "two";
                        break;
                    case 3:
                        result += "three";
                        break;
                    case 4:
                        result += "four";
                        break;
                    case 5:
                        result += "five";
                        break;
                    case 6:
                        result += "six";
                        break;
                    case 7:
                        result += "seven";
                        break;
                    case 8:
                        result += "eight";
                        break;
                    case 9:
                        result += "nine";
                        break;
                }
                if (i != 0){
                    result += " ";
                }
            }
            return result;
        }
    }

    public static int reverse (int number){
        if(number < 0){
            number *= -1;
        }

        List<Integer> digitList = getDigitsList(number);
        int result = 0;

        for (int i = 0; i < digitList.size(); i++){
            result += digitList.get(i);
            if(i != digitList.size()-1)
                result *= 10;
        }
        return result;
    }

    static List<Integer> getDigitsList (int number){
        List<Integer> result = new ArrayList<>();
        while (number > 0){
            result.add(number % 10);
            number /= 10;
        }
        return result;
    }
}
