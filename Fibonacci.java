public class Fibonacci {
    public static void main(String[] args) {
        int num = 8;
        // System.out.println();
        fibo(num);
    }

    static void fibo(int n)
    {
        String fibo = "";
        int a = 0;
        int b = 1;
        // fibo = a.toString() + " " + b.toString();
        fibo = a + " " + b;
        for (int i = 0; i < n-2; i++) 
        {
            int c = a + b;
            fibo = fibo + " " + c;
            a = b;
            b = c;
        }
        System.out.println("The Fibo series is : " + fibo);
    }
}
