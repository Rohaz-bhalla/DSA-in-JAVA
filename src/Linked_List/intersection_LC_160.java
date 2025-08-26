package Linked_List;
import java.util.*;

public class intersection_LC_160 
{
    public static void main(String[] args) 
    {
        MyLinkedList ll1 = new MyLinkedList();
        ll1.add(10);
        ll1.add(20);
        ll1.add(30);
        ll1.add(40);
        
        MyLinkedList ll2 = new MyLinkedList();
        ll2.add(20);
        ll2.add(25);
        ll2.add(30);
        ll2.add(45);
        
        Node start3 = intersection(ll1.start, ll2.start);
        printList(start3);
    }
    
    static Node intersection(Node start1, Node start2)
    {
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        
        Node t1 = start1;
        
        while(t1!=null)
        {
            hs.add(t1.val);
            t1 = t1.next;
        }
        
        Node start3=  null;
        Node t3 = start3;
        Node t2 = start2;
        
        while(t2!=null)
        {
            boolean ans = hs.add(t2.val);
            
            // common element, add to start3
            if(ans==false)   
            {
                if(start3==null)    // add as first node
                {
                    Node nd = new Node(t2.val);
                    start3 = nd; 
                    t3 = nd;
                }
                else                // add more
                {
                    Node nd = new Node(t2.val);
                    t3.next = nd;
                    t3 = nd;
                }
            }
            
            t2 = t2.next;
        }
        
        
        return start3;
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

    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
// public class Solution {
//     public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
//     {
//         if( headA == null || headB == null ) return null;

//         ListNode t1 = headA;
//         ListNode t2 = headB;

//         while( t1 != t2 )
//         {
//             t1 = ( t1 == null ) ? headB : t1.next;
//              //if t1 would be null the pointer will be assigned to headB
//             t2 = ( t2 == null ) ? headA : t2.next;
//         }
//         return t1;
//     }
// }
}
