public class SharedDigit {

    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99 ) {
            return false;
        }
        int Tens1 = num1 / 10;
        int Tens2 = num2 / 10;
        int Unit1 = num1 % 10;
        int Unit2 = num2 % 10;

        return (Tens1 == Tens2 || Tens1 == Unit2 || Unit1 == Unit2 || Tens2 == Unit1 );  // This means return True if any of those conditions are true, else return false.

    }
}
