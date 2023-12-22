import java.util.Scanner;
import java.util.InputMismatchException;

class Mismatch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a number:");
        int inputNo = 0;
        try {
            inputNo = input.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Wrong input");
            System.exit(0);
        }
        System.out.println(inputNo);
    }
}