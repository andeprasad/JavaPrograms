import java.util.*;
public class PrintLargeNoFrom2Inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number 1 : ");
        int no1 = sc.nextInt();
        System.out.print("Enter Number 2 : ");
        int no2 = sc.nextInt();

        System.out.println("\n\nNumber 1 is " + no1);
        System.out.println("Number 2 is " + no2);

        if (no1 > no2) 
        {
            System.out.println("\n" + no1 + " is Greater");    
        }
        else
        {
            System.out.println("\n" + no2 + " is Greater");
        }
    }
}
