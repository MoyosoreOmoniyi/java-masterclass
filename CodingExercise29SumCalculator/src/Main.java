public class Main {

    public static void main(String[] args) {

        SimpleCalculator calculator = new SimpleCalculator();  // Created an Object calculator of type SimpleCalculator.

        calculator.setFirstNumber(5.0);       // Setting the parameters for the method employed in the class calculator belongs to.
        calculator.setSecondNumber(4);

        System.out.println("add= " + calculator.getAdditionResult());   // Getting the result
        System.out.println("subtract= " + calculator.getSubtractionResult());


        // Setting other parameters for the fields
        calculator.setFirstNumber(5.25);
        calculator.setSecondNumber(0);

        System.out.println("multiply= " + calculator.getMultiplicationResult());
        System.out.println("divide= " + calculator.getDivisionResult());
    }

}
