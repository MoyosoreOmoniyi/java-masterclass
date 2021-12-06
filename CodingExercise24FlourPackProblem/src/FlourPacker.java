public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        int BigCount = bigCount * 5;
        if((BigCount + smallCount) < goal) {
            return false;
        }

        if ((goal % 5) > smallCount) {
            return false;
        }
        return true;

    }

    public static void main(String[] args) {
        System.out.println(canPack(3,4,14));
    }
}
