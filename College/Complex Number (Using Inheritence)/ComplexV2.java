import p1.Complex; import java.util.Scanner;

public class ComplexV2 extends Complex {

    // calling base constructor
    ComplexV2() {
        // doubt is this necessary or not
        // super();
    }
    ComplexV2(float r, float i) {
        super(r, i);
    }

    // F1: Subtraction method
    public ComplexV2 sub(ComplexV2 n1) {
        ComplexV2 retObj = new ComplexV2();
        // why this or super does not make a difference in this case?
        retObj.setReal(this.getReal() - n1.getReal());
        retObj.setImag(this.getImag() - n1.getImag());
        return retObj;
    }
}

class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        // take input for first complex number
        System.out.printf("Enter the real part of first complex no: ");
        float Ra = input.nextFloat();
        System.out.printf("Enter the imag part of first complex no: ");
        float Ia = input.nextFloat();
        ComplexV2 a = new ComplexV2(Ra, Ia);
        System.out.println("The first complex number is: " + a);
        
        // take input for second complex number
        System.out.printf("Enter the real part of second complex no: ");
        float Rb = input.nextFloat();
        System.out.printf("Enter the imag part of second complex no: ");
        float Ib = input.nextFloat();
        ComplexV2 b = new ComplexV2(Rb, Ib);
        System.out.println("The second complex number is: " + b);

        // store results
        Complex res1 = a.add(b);
        ComplexV2 res2 = a.sub(b);

        // print results
        System.out.println("The sum is: " + res1);
        System.out.println("The subtraction is: " + res2);
    }
}