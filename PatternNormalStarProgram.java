public class PatternNormalStarProgram {
    public static void main(String[] args) {
        for(int i=0;i<5;i++)
        {
            for(int j=i;j>=0;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\nReverse Pattern");

        for(int i=1;i<=5;i++)
        {
            for(int j=5;j>=i;j--)
            {
                System.out.print("* ");
                // n--;
            }
            System.out.println();
        }
    }
}
