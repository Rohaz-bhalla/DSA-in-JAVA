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
    public ListNode oddEvenList(ListNode head) 
    {
        if( head == null || head.next == null ) return head;

        ListNode odd = head; // pointer at odd indexes
        ListNode even = head.next; //pointer at even indexes 2no. pe even so head.next
        ListNode evenHead = even; //assign the even list head to coonect with odd

        while( odd != null && odd.next != null && even != null && even.next != null )
        {
            odd.next = even.next; // odd ka next = even ka next.. common sense
            odd = odd.next;// store the odd value

            even.next = odd.next;
            even = even.next;
        } 

        // we got 2 lists of odd and even now we have to put put even list at last of odd
        odd.next = evenHead;
        return head;
    }
}