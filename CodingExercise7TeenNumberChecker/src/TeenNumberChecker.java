public class TeenNumberChecker {

    public static boolean hasTeen (int parameter1, int parameter2, int parameter3) {
        if (parameter1 >= 13 && parameter1 <= 19) {
            return true;
        }
        else if (parameter2 >= 13 && parameter2 <= 19) {
            return true;
        }
        else if (parameter3 >= 13 && parameter3 <= 19) {
            return true;
        }
       return false;
    }

    public static boolean isTeen (int parameter1) {
        if (parameter1 >= 13 && parameter1 <= 19) {
            return true;
        }
        else return false;
    }
}
                       // OR

public class TeenNumberChecker {
    public static boolean hasTeen(int num1, int num2, int num3){
        if((num1 >= 13 && num1 <=19) || (num2 >= 13 && num2 <=19) || (num3 >= 13 && num3 <=19)){
            return true;
        }else
            return false;
    }
    public static boolean isTeen(int num1) {
        if(num1 >= 13 && num1 <=19){
            return true;
        }else
            return false;
    }
}



