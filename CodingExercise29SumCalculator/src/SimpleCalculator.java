public class SimpleCalculator {

// Fields
    private double firstNumber;
    private double secondNumber;

// Getters
    public double getFirstNumber(){
        return this.firstNumber;            // to return the parameter in this field
    }

    public double getSecondNumber(){
        return this.secondNumber;
    }

// Setters
    public void setFirstNumber (double firstNumber) {
        this.firstNumber = firstNumber;      // to update the firstNumber field with a firstNumber parameter.
    }

    public void setSecondNumber (double secondNumber) {
        this.secondNumber = secondNumber;
    }

// Getters
    public double getAdditionResult (){
        return this.firstNumber + secondNumber;
    }

    public double getSubtractionResult (){
        return this.firstNumber - secondNumber;
    }

    public double getMultiplicationResult (){
        return this.firstNumber * secondNumber;
    }

    public double getDivisionResult (){
        if (secondNumber == 0) {
            return 0;
        }
        return this.firstNumber / secondNumber;

    }
}
