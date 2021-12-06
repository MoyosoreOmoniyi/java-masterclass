public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit (int number) {

        if (number < 0) {
            return -1;
        }
        int last = number % 10;
        while (number >= 10){
            number = number / 10;
        }
        return number + last;
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(9));
    }
}
