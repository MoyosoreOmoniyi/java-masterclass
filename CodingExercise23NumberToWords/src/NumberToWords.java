public class NumberToWords {

    public static void numberToWords (int number) {
        if (number < 0){
            System.out.println("Invalid Value");
        }
        int numDigits = getDigitCount(number);
        int n = reversed(number);


        while (n != 0) {
            int lastDigit = n % 10;
            n = n / 10;
            numDigits = numDigits -1;

            if (n == 0) {
                System.out.println("Zero");
            }
            else {
                if (lastDigit == 0) {
                    System.out.println("Zero");

                }
                if (lastDigit == 1) {
                    System.out.println("One");

                }
                if (lastDigit == 2) {
                    System.out.println("Two");

                }
                if (lastDigit == 3) {
                    System.out.println("Three");

                }
                if (lastDigit == 4) {
                    System.out.println("Four");

                }
                if (lastDigit == 5) {
                    System.out.println("Five");

                }
                if (lastDigit == 6) {
                    System.out.println("Six");

                }
                if (lastDigit == 7) {
                    System.out.println("Seven");

                }
                if (lastDigit == 8) {
                    System.out.println("Eight");

                }
                if (lastDigit == 9) {
                    System.out.println("Nine");

                }
            }

        }
    }

    public static int reversed (int number){

        int reverse = 0;
        int digitCountSq = (int) Math.pow(10, getDigitCount(number) - 1);
        while(number != 0){
            int lastDigit = number % 10;
            reverse = reverse + (digitCountSq * lastDigit);
            number = number/10;
            digitCountSq /=10;
        }
        return reverse;
    }

    public static int getDigitCount(int number){
        if (number< 0){
            return -1;
        }
        int count = 0;

        while(number != 0){
            number = number / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        numberToWords(100);
        System.out.println(getDigitCount(100));
    }
}
