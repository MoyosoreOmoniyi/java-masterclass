public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int original = number;
        // We are transitioning Original number to 0 and reverse to original number


        while (number != 0) {
            int lastDigit = number % 10;  // 1 / 10 == 0 r 1
            reverse = (reverse * 10) + lastDigit;
            number /= 10;
        }
       return reverse==original;  // This means return T or F if reverse is equal to original
//        if (reverse==original){
//            return true;
//        }
//        return false;
    }

    public static void main(String[] args) {
        System.out.println( isPalindrome(-123));
    }


}


