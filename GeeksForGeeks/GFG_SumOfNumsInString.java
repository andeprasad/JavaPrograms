/*
 * Given a string str containing alphanumeric characters. The task is to calculate the sum of all the numbers present in the string.
 * 
 * Input:
 * str = 1abc23
 * Output: 24
 * Explanation: 1 and 23 are numbers in the string which is added to get the sum as 24.
 * 
 * Input:
 * str = geeks4geeks
 * Output: 4
 * Explanation: 4 is the only number, so the sum is 4.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GFG_SumOfNumsInString {
    public static void main(String[] args) {
        String str = "1abc23";
        System.out.println(findSum(str));
    }

    public static long findSum(String str)
    {
        long sum = 0;
        String[] splitstr = str.split("[a-zA-Z]");
        System.out.println(Arrays.toString(splitstr));
        List<Integer> li = new ArrayList<>();

        System.out.println();

        for (String string : splitstr) {
            if(!string.isEmpty())
            {
                li.add(Integer.valueOf(string));
            }
        }

        System.out.println("After adding all the integer elements into the list : ");

        for (Integer integer : li) {
            sum = sum + integer;
            System.out.println(integer);
        }
        System.out.println();
        return sum;
    }
}
