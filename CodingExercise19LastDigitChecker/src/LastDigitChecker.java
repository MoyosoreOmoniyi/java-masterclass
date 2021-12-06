public class LastDigitChecker {
    
    public static boolean hasSameLastDigit (int num1, int num2, int num3) {
        if (num1 < 10 || num2 < 10 || num3 < 10 || num1 > 1000 || num2 > 1000 || num3 > 1000) {
            return false;
        }
        int L1 = num1 % 10;
        int L2 = num2 % 10;
        int L3 = num3 % 10;

        if (L1 != L2 && L1 != L3 && L2 != L3){ // That is, if none of the numbers are equal.
            return false;
        }
        return true;

        // Alternatively,

        //return (L1 == L2 || L1 == L3 || L2 == L3);

    }

    public static boolean isValid (int num) {
        return (num >= 10 && num <= 1000);

    }
}
