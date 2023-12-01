import java.util.*;

public class TakeInputUntilX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[100];
        System.out.print("Enter Numbers : ");
        int i = 0;
        int sum = 0;

        do {
            try
            {
                a[i] = Integer.parseInt(sc.nextLine());
                sum = sum + a[i];
                i++;
            }
            catch(Exception e)
            {
                System.out.println(e.toString());
                System.out.println("Addition is " + sum);
                break;
            }
        } while (true);
        // System.out.println("Addition is " + sum);
    }
}
