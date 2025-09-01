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
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {
        if( headA == null || headB == null ) return null;

        ListNode t1 = headA;
        ListNode t2 = headB;

        while( t1 != t2 )
        {
            t1 = ( t1 == null ) ? headB : t1.next;
             //if t1 would be null the pointer will be assigned to headB
            t2 = ( t2 == null ) ? headA : t2.next;
        }
        return t1;
    }
}