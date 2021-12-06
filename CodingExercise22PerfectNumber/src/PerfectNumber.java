public class PerfectNumber {

    public static boolean isPerfectNumber (int number) {
        if (number < 1){
            return false;
        }

        int sum = 0;
        for (int i =1; i < number; i++){ // The factor will be the corresponding loop number
            if (number % i == 0){        // If the loop is a factor, sum it
                sum+=i;
            }

        }
        return (sum==number); // return true if sum is equal to the number.


    }
}
