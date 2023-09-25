import java.util.Scanner;

class Complex {
    // declaring variables
    float real, imag;
    
    // constructor for complex number object
    public Complex(float i, float j) {
        this.real = i;
        this.imag = j;
    }
    
    // F1: method for adding two complex numbers with return type same as the class and paramaters of class Complex as well
    static Complex add(Complex n1, Complex n2) {
        // adding real part of two complex numbers
        float r = n1.real + n2.real;
        // adding imag part of two complex numbers
        float i = n1.imag + n2.imag;
        // creating an object of Complex class to store the two values
        Complex res = new Complex(r, i);
        // returning the object as output
        return res;
    }

    // F2: method to print the complex number
    public void print() {
        System.out.printf("%.2f + i %.2f\n", this.real, this.imag);
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
        System.out.printf("The first complex number is: ");
        a.print();

        // take input for second complex number
        System.out.printf("Enter the real part of second complex number: ");
        float Rb = input.nextFloat();
        System.out.printf("Enter the imag part of second complex number: ");
        float Ib = input.nextFloat();
        Complex b = new Complex(Rb, Ib);
        System.out.printf("The second complex number is: ");
        b.print();

        // calculate the sum and print it
        Complex res = Complex.add(a, b);
        System.out.printf("The sum is: ");
        res.print();
    }
}