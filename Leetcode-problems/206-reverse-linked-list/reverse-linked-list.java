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
    public ListNode reverseList(ListNode start) 
    {
        ListNode start2 = null;

        ListNode t = start;

        while( t != null )
        {
            int num = t.val; // takes the val of current node

            ListNode nd  = new ListNode(num); // create a new node with that val
            nd.next = start2; //insert at the front
            start2 = nd; // update the head

            t = t.next;
        }
        return start2;
    }
}