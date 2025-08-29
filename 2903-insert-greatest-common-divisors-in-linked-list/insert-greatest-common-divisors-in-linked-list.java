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

    int findGCD( int a, int b )
    {
        if( b == 0 ) return a;
        return findGCD( b, a%b ); 
        // we swapped a%b,b bcz a<b and a%b will give a small val.. as bigVal - smallVal hona chahiye 
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) 
    {
        if( head == null || head.next == null ) return head;

        ListNode t1 = head;

        while( t1 != null && t1.next != null )
        {
            int max = Math.max( t1.val, t1.next.val );
            int min = Math.min( t1.val, t1.next.val );
            int gcd = findGCD( max,min );
            ListNode nd  = new ListNode( gcd );
            nd.next = t1.next;
            t1.next = nd;
            t1 = nd.next;
        }
        return head;
    }
}