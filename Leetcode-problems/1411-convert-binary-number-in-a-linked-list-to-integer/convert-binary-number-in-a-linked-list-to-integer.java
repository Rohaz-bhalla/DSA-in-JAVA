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
    public int getDecimalValue(ListNode head) 
    {
        ListNode t = head;
        int num = 0;

        while( t != null )
        {
            num = num*2 + t.val;
            t = t.next;
        }
        return num;
    }
}