public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor (int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        while (first != second) {
            if (first > second) {
                first = first - second;
            } else {
                second = second - first;
            }

        }
        return first;

    }

    // Using The For Loop

    public static int gcd(int first, int second){

        int greatestDivisor = 1;
        for (int i = 1; i <= first && i <= second; i++){  // Terminate when the loop number is less than or equal to both first and second
            if (first % i == 0 && second % i == 0){
                greatestDivisor = i;                      // Greatest divisor is determined by the loop that executes.

            }
        }
        return greatestDivisor;
    }
}
