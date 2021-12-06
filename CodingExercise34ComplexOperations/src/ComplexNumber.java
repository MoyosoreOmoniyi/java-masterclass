public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add (double real, double imaginary){  // This method needs to add parameters to the fields.
        this.real = this.real + real;
        this.imaginary = this.imaginary + imaginary;

    }

    public void add (ComplexNumber complexNumber){   // Since this is a new method of class/type ComplexNumber, it will have it's own real and imaginary fields different from "this's" real and imaginary fields.
        this.real += complexNumber.real;             // This method needs to add the it's complex number parameter to the corresponding instance variables (i.e "this's"). so the instance variable becomes it's initial + the complex number variable.
        this.imaginary+=complexNumber.imaginary;
    }

    public void subtract (double real, double imaginary){
        this.real = this.real - real;
        this.imaginary = this.imaginary - imaginary;
    }

    public void subtract (ComplexNumber complexNumber){
        this.real -= complexNumber.real;
        this.imaginary-=complexNumber.imaginary;
    }


}
