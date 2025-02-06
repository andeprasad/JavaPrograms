import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GFG_ArraySubset {
    public static void main(String[] args) 
    {
        // long a1[] = {11, 7, 1, 13, 21, 3, 7, 3};
        // long a2[] = {11, 3, 7, 1, 7};
        // System.out.println("The Array subset result is : " + isSubset(a1, a2, a1.length, 5));

        // int a1[] = {11, 7, 1, 13, 21, 3, 7, 3};
        // int a2[] = {11, 3, 7, 1, 7};

        int a1[] = {1, 2, 2};
        int a2[] = {1, 1};

        // int a1[] = {10, 5, 2, 23, 19};
        // int a2[] = {19, 5, 3};

        // int a1[] = {1, 2, 3, 4, 4, 5, 6};
        // int a2[] = {1, 2, 4};
        // System.out.println("The Array subset result is : " + isSubset(a1, a2, a1.length, a2.length));
        System.out.println("The Array subset result by using HashSet is : " + isSubsetUsingHashSet(a1, a2, a1.length, a2.length));
    }

    static boolean isSubsetUsingHashSet(int a[], int b[], int m, int n)
    {
        HashMap<Integer, Integer> countMap = new HashMap<>();

        for (int num : a) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (int num : b) {
            System.out.println("\nThe Num is : " + num);
            System.out.println("The 1st if condition : " + !countMap.containsKey(num));
            System.out.println("The 2nd if condition is : " + (countMap.get(num) <= 0) + " and i wanted to see the result of this conditon : " + countMap.get(num));
            if (!countMap.containsKey(num) || countMap.get(num) <= 0) {
                return false;
            }
            countMap.put(num, countMap.get(num) - 1);
        }
        return true;
    }
    
    // After 1110 testcases the timeout error was showing in GFG website
    public static String isSubset(int a1[], int a2[], int n, int m) 
    {
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            l.add(a1[i]);
        }

        System.out.println("The List elements added is : " + l);
        System.out.println("The Array 2 elements are : " + Arrays.toString(a2));

        // String result;
        int count = 0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<l.size();j++)
            {
                int a = (int)l.get(j);
                System.out.println("\nValue coming from List is : " + a);
                System.out.println("Value coming from variable B is : " + a2[i]);
                if(a2[i] == a)
                {
                    System.out.println("Yes it came inside the IF condition");
                    count++;
                    l.remove(j);
                    break;
                }
            }
            System.out.println("After removing the index the list values are : " + l);
        }
        System.out.println("The count is : " + count);
        System.out.println("The second check is : " + (n-m));
        if(count == m)
        {
            return "Yes";
        }

        return "No";
    }
}
