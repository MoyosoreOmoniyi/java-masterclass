public class LargestPrime {

    public static int getLargestPrime(int number) {

        if (number <= 0 || (number == 1)) {
            return -1;
        }
        int i = 2;
        while (i < number) {
            if (number % i == 0){
                number/=i;
                i--;
            }
            i++;
        }
//        for (int i =2; i < number; i++){
//            if (number % i == 0) {
//                number = number / i;
//                i--;
//            }
//        }
        return number;
    }
}
