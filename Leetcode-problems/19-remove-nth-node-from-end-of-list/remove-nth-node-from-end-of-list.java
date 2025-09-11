/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) 
    {
        int len = size( head );
        int index = len - n; // piche se minus

        if( head == null )
        {
            //do nothing
        }       

        else if( index < 0 || index >= size( head ) )
        {
            //do nothing
        }

        else if( index == 0 )
        {
            head = head.next; // remove last node agar pele se hi last hai
        }

        ListNode t = head;
        int i = 0; // its the pointer which stops on the node which is to be deleted 

        while( t != null )
        {
            if( i == index -1 ) // we have to stop 1 before to delete
            {
                t.next = t.next.next; // t.next means the node next to i pointer which to be deleted
                break;
            }
            t = t.next; // traverse
            i++;
        }
        return head;
    }
    
    static int size( ListNode head )
    {
        ListNode t = head;
        int i = 0;

        while( t != null )
        {
            i++;
            t = t.next;
        }
        return i;
    }
}