public class main {

    public static void main(String[] args) { // I typed p s v m

        long milesPerHour = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles Per Hour is " + milesPerHour);

        SpeedConverter.printConversion(10.5);
        SpeedConverter.printConversion(0);
        SpeedConverter.printConversion(-2.0);




    }
}
