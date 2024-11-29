/*
 * Write a program to implement a Stack using Array. 
 * Your task is to use the class as shown in the comments in the 
 * code editor and complete the functions push() and pop() to 
 * implement a stack. The push() method takes one argument, 
 * an integer 'x' to be pushed into the stack and pop() which returns 
 * an integer present at the top and popped out from the stack. 
 * If the stack is empty then return -1 from the pop() method.
 * 
 * Input: 1 2 1 3 2 1 4 2 
 * Output: 3, 4
 * Explanation: 
 * push(2)    the stack will be {2}
 * push(3)    the stack will be {2 3}
 * pop()      poped element will be 3,
 * the stack will be {2}
 * push(4)    the stack will be {2 4}
 * pop()      poped element will be 4
 */

import java.util.Arrays;
import java.util.Scanner;

public class GFG_StackImplementation {
    public static void main(String[] args) 
    {
        MyStack m = new MyStack();
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.nextLine();
        String[] a = inputStr.split(" ");
        String returnedElements = "";
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
            if("1".equals(a[i]))
            {
                m.push(a[i+1]);
                i++;
            }
            else if("2".equals(a[i]))
            {
                // System.out.println("Pop has been called and the default element is " + m.pop());
                returnedElements = returnedElements + " " + m.pop();
            }
        }

        System.out.println("The Final Stack is : " + Arrays.toString(m.displayStack()));
        System.out.println("The Final Returned Element String is : " + returnedElements);
        sc.close();
    }
}

class MyStack {
    private final int[] arr;
    private int top;

    public MyStack() {
        arr = new int[10];
        top = -1;
    }

    public void push(String x) 
    {
        top++;
        System.out.println("Push has been called and the value which came is : " + x);
        arr[top] = Integer.parseInt(x);
    }

    public int pop() 
    {
        int result = -1;
        if(top == -1)
        {
            return result;
        }
        else
        {
            top = top - 1;
            return arr[top+1];
        }
        // return result;
    }

    int[] displayStack() 
    {
        return arr;
    }
}
