import java.util.Scanner;

public class InputCalculator {
    
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);



        int sum = 0;
        int average = 0;
        int count = 0;

        while (true) {
            System.out.println("Enter:");
            boolean isInt = scanner.hasNextInt();

            if (isInt){
               int number = scanner.nextInt();
                count++;
                sum += number;

            }
            else{
                break;
            }

        }
        average = sum / count;
        average = Math.round(average);

        System.out.println("SUM = " + sum + " AVG = " + average);

        scanner.close();
    }

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();

    }
}
