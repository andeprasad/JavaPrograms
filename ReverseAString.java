import java.util.*;
public class ReverseAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name : ");
        String name = sc.next();

        System.out.println("\nName is " + name);

        int len = name.length();
        System.out.println("Length is " + len);

        for(int i=len;i>0;i--)
        {
            System.out.print(name.charAt(i-1));
        }
    }
}
