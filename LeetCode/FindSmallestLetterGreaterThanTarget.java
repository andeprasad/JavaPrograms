/*
 * You are given an array of characters letters that is sorted in non-decreasing order,
 *  and a character target. There are at least two different characters in letters.
 * Return the smallest character in letters that is lexicographically greater than target. 
 * If such a character does not exist, return the first character in letters.
 * 
 * Input: letters = ["c","f","j"], target = "a"
 * Output: "c"
 * Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'
 * 
 * Input: letters = ["c","f","j"], target = "c"
 * Output: "f"
 * Explanation: The smallest character that is lexicographically greater than 'c' in letters is 'f'.
 * 
 * Input: letters = ["x","x","y","y"], target = "z"
 * Output: "x"
 * Explanation: There are no characters in letters that is lexicographically greater than 'z' so we return letters[0].
 */
package LeetCode;

class FindSmallestLetterGreaterThanTarget
{
    public static void main(String[] args) {
        // char[] letters = {'c', 'f', 'j'};
        // char target = 'a';
        // char target = 'c';

        // char[] letters = {'c', 'f', 'j'};
        // char target = 'd';
        
        char[] letters = {'x','x','y','y'};
        char target = 'z';
        System.out.println("The Smallest letter Greater than target : " + target + " is : " + nextGreatestLetter(letters, target));
    }

    static public char nextGreatestLetter(char[] letters, char target) 
    {
        int start = 0, end = letters.length-1;
        int mid = 0;
        while(start <= end)
        {
            mid = (start + end)/2;
            if(target < letters[mid])
            {
                System.out.println("Its inside IF");
                end = mid - 1;
            }
            else
            {
                System.out.println("Its inside Else");
                start = mid + 1;
            }
        }
        System.out.println("Outside the while");
        return letters[start % letters.length];
    }
}