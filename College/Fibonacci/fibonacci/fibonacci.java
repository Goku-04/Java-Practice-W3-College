/* created by Amar Sir using recursion */
public class fibonacci {
    static int top = 0;
	int fib(int n)
    {
        if (n <= 1)
        {
            top--;
            return n;
        }
        int val= fib(n - 1) + fib(n - 2);
        if(top==-2)
            System.out.println(val+":"+top);
            top++;
            return val;
    }
}

class DisplaySeries
{
     public static void main(String args[])
    {
        int n = 10;
        fibonacci fibObj= new fibonacci();
    
        fibObj.fib(n);
    }
}