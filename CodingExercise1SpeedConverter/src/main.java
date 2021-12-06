public class main {

    public static void main(String[] args) { // I typed p s v m
        //SpeedConverter.toMilesPerHour(10.5); // I just called this class. Since in the original class, I didn't ask it to print, hence, we print here.

        long milesPerHour = SpeedConverter.toMilesPerHour(10.5); // I assigned the method to a variable, now I can print out.
        System.out.println("Miles Per Hour is " + milesPerHour);

        SpeedConverter.printConversion(10.5);
        SpeedConverter.printConversion(0);
        SpeedConverter.printConversion(-2.0);




    }
}
