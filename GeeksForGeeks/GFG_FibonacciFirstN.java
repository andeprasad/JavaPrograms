
import java.util.Arrays;

public class GFG_FibonacciFirstN {
    public static void main(String[] args) 
    {
        int n = 5;
        System.out.println("The Fibonacci Series is : " + Arrays.toString(printFibb(n)));
    }

    public static long[] printFibb(int n) 
    {
        if(n == 1)
            return new long[]{1};

        long[] l = new long[n];
        l[0] = 1;
        l[1] = 1;

        for(int i=2;i<n;i++)
        {
            long next = l[i-1] + l[i-2];
            l[i] = next;
        }

        return l;
    }
}
