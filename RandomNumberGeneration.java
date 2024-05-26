import java.util.*;

public class RandomNumberGeneration {
    public static void main(String[] args) {
        int c;
        Random ran = new Random();
        // random integers in [0, 100]
        for (c = 1; c <= 10; c++) 
        {
            System.out.println(ran.nextInt(100));
        }
    }
}
