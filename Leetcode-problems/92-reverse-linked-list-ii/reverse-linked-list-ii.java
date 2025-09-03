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
    public ListNode reverseBetween(ListNode head, int left, int right) 
    {
        // create a dummy list and mark it to the  head of the original list
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        //make markers
        ListNode prev = dummy;
        ListNode curr = head;

        for( int i=0; i < left - 1; i++ )
        {
            prev = prev.next;
            curr = curr.next;
        }

        // mark the starting of subList
        ListNode subList = curr;


        
        for( int j = 0; j < right - left; j++ )
        {
            curr = curr.next;
        }

        //mark the end of subList
        ListNode subEnd = curr;
        ListNode rest = curr.next;
        subEnd.next = null;

        ListNode revHead = reverseSubList( subList );

        //connect
        prev.next = revHead;

        //move to the end of rev subList
        ListNode tail = revHead;
        while( tail.next != null ) tail = tail.next;

        tail.next = rest;

        return dummy.next;
    }

// reverse helper (in-place reversal)
    public ListNode reverseSubList( ListNode head )
    {
        ListNode prev = null;
        ListNode curr = head;

        while( curr != null )
        {
            ListNode nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }
}