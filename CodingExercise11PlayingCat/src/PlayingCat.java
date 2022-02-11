public class PlayingCat {

    public static boolean isCatPlaying (boolean summer, int temperature) {
        if (summer && (temperature >= 25 && temperature <= 45)) {
            return true;
        }
        else if (!summer && (temperature >= 25 && temperature <= 35)) {
            return true;
        }
        return false;
    }
}

                // OR

//public class PlayingCat {
//    private static final boolean BOOLEAN_VALUE = true;
//    public static boolean isCatPlaying(boolean summer, int temperature){
//        //    summer = true;
//        if((summer == true) && (temperature >=25 && temperature <=45)){
//            return BOOLEAN_VALUE;
//        }else if((summer == false) && (temperature >= 25 && temperature <= 35)){
//            return BOOLEAN_VALUE;
//        }else
//            return false;
//    }
//}