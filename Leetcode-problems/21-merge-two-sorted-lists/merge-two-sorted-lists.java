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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
    {
        if( list1 == null && list2 == null ) return null;
        else if( list1 == null ) return list2;
        else if( list2 == null ) return list1;

        ListNode t1 = list1, t2 = list2;
        ListNode list3 = null, t3 = null;

        while( t1 != null && t2 != null )
        {
            ListNode nd;   // declare once outside
            if( t1.val < t2.val )
            {
                nd = new ListNode( t1.val );
                t1 = t1.next;
            }
            else
            {
                nd = new ListNode( t2.val );
                t2 = t2.next;
            }

            if( list3 == null ) // starting main new list is null
            {
                list3 = nd; // head of new list
                t3 = nd; // tail 
            }
            else
            {
                t3.next = nd;   //link new node
                t3 = nd;
            }
        }

        // attach remaining nodes
        while( t1 != null )
        {
            ListNode nd = new ListNode( t1.val );
            t3.next = nd;
            t3 = nd;
            t1 = t1.next;
        }
        while( t2 != null )
        {
            ListNode nd = new ListNode( t2.val );
            t3.next = nd;
            t3 = nd;
            t2 = t2.next;
        }

        return list3;
    }
}
