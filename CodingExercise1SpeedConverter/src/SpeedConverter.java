public class SpeedConverter { //Created a class

    public static long toMilesPerHour (double kilometersPerHour) { // I created a method with a parameter of type double to return a value of type long.
        if (kilometersPerHour < 0) {
            return -1;
        }
        else {
            return Math.round(kilometersPerHour / 1.609);
        }


    }

    public static void printConversion (double kilometersPerHour) { // I created another method with a parameter of type double to return nothing.

       long milesPerHour = toMilesPerHour(kilometersPerHour); // I called the method that I want to use for my calculation and saved it in a variable of type long(because the method above has a type long output).
        if (kilometersPerHour >= 0) {
            System.out.println( kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
        else {
            System.out.println("Invalid Value");
        }

    }

}
