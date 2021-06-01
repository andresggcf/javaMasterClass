package Section5.codingExcercises;

public class SharedDigit {
    public static boolean hasSharedDigit(int one, int two){
        if (one >= 10 && one <= 99 && two >= 10 && two <= 99){
            int num = one;

            while (num > 0){
                int digit = num % 10;
                int num2 = two;

                while (num2 > 0){
                    int digit2 = num2 % 10;
                    if (digit == digit2){
                        return true;
                    }
                    num2 = num2 / 10;
                }
                num = num / 10;
            }
        }
        return false;
    }
}
