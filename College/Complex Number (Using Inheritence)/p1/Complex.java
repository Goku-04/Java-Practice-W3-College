package p1;
import java.util.Scanner;

public class Complex {
    // declaring variables
    private float real, imag;
    
    // default constructor
    public Complex() {
        real = 0;
        imag = 0;
    }
    // constructor for complex number object
    public Complex(float real, float imag) {
        this.real = real;
        this.imag = imag;
    }
    
    // F1: getters and setters for real
    protected float getReal() {
        return this.real;
    }
    protected void setReal(float real) {
        this.real = real;
    }

    // F2: getters and setters for imag
    protected float getImag() {
        return this.imag;
    }
    protected void setImag(float imag) {
        this.imag = imag;
    }

    // F3: method for adding two complex numbers with return type same as the class and paramaters of class Complex as well
    public Complex add(Complex n1) {
        // create a return object
        Complex retObj = new Complex();
        // set its real value
        retObj.setReal(this.real + n1.real);
        // set its imag value
        retObj.setImag(this.imag + n1.imag);
        return retObj;
    }

    // F2: method to print the complex number
    // toString method returns a string that "textually represents" the  object when println is called hence overriding it
    public String toString() {
        return real+" + "+imag+" i ";
    }
    
}

class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        // take input for first complex number
        System.out.printf("Enter the real part of first complex number: ");
        float Ra = input.nextFloat();
        System.out.printf("Enter the imag part of first complex number: ");
        float Ia = input.nextFloat();
        Complex a = new Complex(Ra, Ia);
        System.out.println("The first complex number is: " + a);

        // take input for second complex number
        System.out.printf("Enter the real part of second complex number: ");
        float Rb = input.nextFloat();
        System.out.printf("Enter the imag part of second complex number: ");
        float Ib = input.nextFloat();
        Complex b = new Complex(Rb, Ib);
        System.out.println("The second complex number is: " + b);

        // calculate the sum and print it
        Complex res = a.add(b);
        System.out.println("The sum is: " + res);
    }
}