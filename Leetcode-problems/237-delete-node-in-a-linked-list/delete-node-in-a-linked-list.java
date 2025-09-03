/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) 
    {
        node.val = node.next.val; // next node value is copied in current node
        node.next = node.next.next; // delete the next node
    }
}