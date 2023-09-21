import java.util.Scanner;

class Foo {
    private int n; // private data member

    public int recur_fibo(int n) {
        this.n = n;
        if (n == 0) {
            return 0;
        }
        else if (n == 1) {
            return 1;
        }
        return (recur_fibo(n - 1) + recur_fibo(n - 2));
    }

    // public getters and setters
    public int getLen() {
        return this.n;
    }

    public void setLen() {
        Scanner input = new Scanner(System.in);
        System.out.print("Number of terms: ");
        int len = input.nextInt();
        this.n = len;
    }
}

class Bar {

    public static void main(String args[]) {
        
        Foo series = new Foo();
        series.setLen();
        for (int i = 0, len = series.getLen(); i < len; i++)
        {   
            // fibonacci using recursion 
            System.out.printf("%d ", series.recur_fibo(i));
        }
        System.out.println(series.getLen());
        System.out.println();
    }
}