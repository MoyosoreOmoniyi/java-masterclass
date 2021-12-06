public class BarkingDog {

    public static boolean shouldWakeUp (boolean barking, int hourOfDay) { // I created a method to return a boolean
        if (barking && (hourOfDay > 0 && hourOfDay < 8)|| ( hourOfDay > 22 && hourOfDay <= 23)) {
            return true;
        }
        else if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        else if (hourOfDay == 0 && barking)
            return true;
        else
            return false;
    }

}
                                     // OR

//public class BarkingDog {
//    public static boolean shouldWakeUp (boolean barking, int hourOfDay){
//        if(hourOfDay < 0 || hourOfDay > 23 ) { // First we specify the range
//            return false;
//        }else if((hourOfDay < 8 || hourOfDay > 22)&& barking == true) {
//            return true;
//        }else
//            return false;
//    }
//}