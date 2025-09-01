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
    public boolean isPalindrome(ListNode head) 
    {
    if (head == null || head.next == null) return true;

        ListNode slow = head;
        ListNode fast = head;

        while( fast != null && fast.next != null )
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHalf = reverseList( slow );

        ListNode firstHalf = head;

        while( secondHalf != null )
        {
            if( secondHalf.val != firstHalf.val ) return false;
            
            else
            {
                // traverse
                firstHalf = firstHalf.next;
                secondHalf = secondHalf.next;
            }
        }
        return true;
    }

    public ListNode reverseList(ListNode head) 
    {
        ListNode List2 = null;

        ListNode t = head;

        while( t != null )
        {
            int num = t.val; // takes the val of current node

            ListNode nd  = new ListNode(num); // create a new node with that val
            nd.next = List2; //insert at the front
            List2 = nd; // update the head

            t = t.next;
        }
        return List2;
    }
  }
