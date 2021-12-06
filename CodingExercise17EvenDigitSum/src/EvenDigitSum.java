public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {
        if (number < 0){
            return -1;
        }
        int evenDigitSum = 0;   // Declare a variable to store the sum value
        while (number > 0) {
            int lastDigit = number % 10;  // Find the last digit of the number
            if (lastDigit % 2 == 0) {     // Check if the last digit is even
                evenDigitSum += lastDigit;
            }
            number = number / 10;       // Remove the last digit of the number
        }
        return evenDigitSum;
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(0));
    }
}
