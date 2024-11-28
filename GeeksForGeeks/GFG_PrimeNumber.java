public class GFG_PrimeNumber {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(isPrime(n));
    }
    static int isPrime(int N){
        int count=0;
        if(N == 1)
        {
            return 0;
        }

        for(int i=2;i<=Math.sqrt(N);i++)
        {
            if(N % i == 0)
            {
                count++;
            }
        }
        if(count == 0)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
}
