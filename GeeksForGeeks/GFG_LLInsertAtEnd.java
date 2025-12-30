package GeeksForGeeks;

/*
You are given the head of a Singly Linked List and a value x, insert that value x at
the end of the LinkedList and return the head of the modified Linked List.

Input: x = 6,
Output: 1 -> 2 -> 3 -> 4 -> 5 -> 6
Explanation: We can see that 6 is inserted at the end of the linkedlist.

Input: x = 1,
Output: 4 -> 5 -> 1
Explanation: We can see that 1 is inserted at the end of the linked list.
 */

class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}

public class GFG_LLInsertAtEnd {
    public static void main(String[] args) {
//        Call the insertAtEnd(head, 5);
    }

    static public Node insertAtEnd(Node head, int x) {
        Node last = new Node(x);
        if(head == null)
        {
            head = last;
            return head;
        }
        if(head.next == null)
        {
            head.next = last;
            return head;
        }
        Node currentNode = head;
        while(currentNode.next != null)
        {
            currentNode = currentNode.next;
        }
        currentNode.next = last;
        return last;
    }
}
