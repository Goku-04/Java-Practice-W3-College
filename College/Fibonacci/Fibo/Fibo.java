import java.util.Scanner;

public class Fibo {
    
    // fibonacci series using for loop
    public void loop_fibo(int n) {
        // initialised variables
        int a1 = 0, a2 = 1;
        // no terms asked
        if (n == 0) {
            System.out.println("No terms to print out");
        }
        // only 1 term asked
        else if (n == 1) {
            System.out.println(a1);
        }
        // more than 1 terms asked
        else {
            System.out.printf("%d %d", a1, a2);
            // two terms already printed therefore loop till n-2
            for (int i = 0; i < (n - 2); i++)
            {
                int a3 = a1 + a2;
                System.out.printf(" %d", a3);
                a1 = a2;
                a2 = a3;
            }
            // newline because printf does not
            System.out.println();
        }
    }
}

class Main {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        Fibo series = new Fibo();
        System.out.print("Number of terms: ");
        int n = input.nextInt();
        // fibonacci using loop
        series.loop_fibo(n);
    }
}