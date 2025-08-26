package Linked_List;

import java.util.ArrayDeque;

public class Reorder_LinkedList_Leetcode_143 
{
    public static void main(String[] args) 
    {
        MyLinkedList ll = new MyLinkedList();
        
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        
        reorderList(ll.start);
        
        printList(ll.start);
    }
    
    public static void reorderList(Node start) 
    {
        ArrayDeque<Integer> dq = new ArrayDeque<>();
        
        Node t = start;
        
        // Store element in dq
        while(t!=null)
        {
            dq.add(t.val);
            t = t.next;
        }
        
        System.out.println(dq);
        int val;
        
        // Extract 1 element from front and 1 element from back
        // and update to original list
        
        t = start;
        
        while(true)
        {
            val = dq.removeFirst();
            System.out.println(val);
            
            // update values in original list
            t.val = val;
            t = t.next;
            
            if(dq.isEmpty())
            {
                break;
            }
            
            val = dq.removeLast();
            System.out.println(val);
            // update values in original list
            t.val = val;
            t = t.next;
            
            if(dq.isEmpty())
            {
                break;
            }
        }
        
        
    }
    
    static void printList(Node start)
    {
         // Print LinkedList
        Node t = start;         
        System.out.print("start -->");
        while(t!=null)
        {
            System.out.print(t.val+" --> ");
            t = t.next;
        }
        System.out.println("X");
}
}