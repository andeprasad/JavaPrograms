/*
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit 
 * of the integer. The digits are ordered from most significant to least significant in left-to-right order. 
 * The large integer does not contain any leading 0's.
 * 
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123. Incrementing by one gives 123 + 1 = 124.
 * Thus, the result should be [1,2,4].
 * 
 * Input: digits = [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321. Incrementing by one gives 4321 + 1 = 4322. Thus, the result should be [4,3,2,2].
 * 
 * Input: digits = [9]
 * Output: [1,0]
 * Explanation: The array represents the integer 9. Incrementing by one gives 9 + 1 = 10. Thus, the result should be [1,0].
 */

package LeetCode;

import java.math.BigInteger;
import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        // int[] digits = {1,2,3};
        // int[] digits = {4,3,2,1};
        // int[] digits = {9};
        int[] digits = {9,8,7,6,5,4,3,2,1,0};
        System.out.println("The New Array is : " + Arrays.toString(plusOne(digits)));
    }

    static public int[] plusOne(int[] digits) 
    {
        System.out.println("The Original Array is : " + Arrays.toString(digits));
        BigInteger sum = BigInteger.ZERO;
        String strNum = "";

        for (int i = 0; i < digits.length; i++) {
            strNum = strNum + "" + digits[i];
        }

        sum = new BigInteger(strNum).add(BigInteger.ONE);
        String finalNum = sum + "";
        System.out.println("The Final Str is : " + finalNum);

        int[] newArr = new int[finalNum.length()];
        for (int i = 0; i < digits.length; i++) {
           newArr[i] = Integer.parseInt(String.valueOf(finalNum.charAt(i)));
        }
        
        return newArr;    
    }
}
