package Section5.codingExcercises;

public class LastDigitChecker {

    public static boolean hasSameLastDigit (int one, int two, int three){
        if (isValid(one)
                && isValid(two)
                && isValid(three)){

            int digit1 = one % 10;
            int digit2 = two % 10;
            int digit3 = three % 10;

            return digit1 == digit2
                    || digit1 == digit3
                    || digit2 == digit3;
        } else {
            return false;
        }
    }

    public static boolean isValid (int number){
        return number >= 10 && number <= 1000;
    }
}
