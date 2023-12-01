import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int year;
        // System.out.print("Enter Year : " + (year = sc.nextInt()));

        int year;
        System.out.print("Enter Year : ");
        year = Integer.parseInt(sc.next());

        if (year % 4 == 0)
        {
            System.out.println("\n\n" + year + " is Leap Year");
        }
        else
        {
            System.out.println("\n\n" + year + " is Not Leap Year");
        }

        System.out.println("\nYeaar is : " + year);
    }
}
