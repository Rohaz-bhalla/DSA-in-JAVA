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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        if(l1 == null && l2 == null) return null;

        ListNode t1 = l1;
        ListNode t2 = l2;

        ListNode l3 = null, t3 = null; 

        int carry = 0;

        // process both lists until both are null
        while(t1 != null || t2 != null)
        {
            int sum = carry; // include carry from previous step

            if(t1 != null)
            {
                sum += t1.val; // add value from list1
                t1 = t1.next;
            }

            if(t2 != null)
            {
                sum += t2.val; // add value from list2
                t2 = t2.next;
            }

            int digit = sum % 10; // remainder goes into current node.. 17%10 = 7(unit place)
            carry = sum / 10;     // carry for next iteration.. 17/10 = 1 (carry)

            ListNode nd = new ListNode(digit); // create new node for this digit

            if(l3 == null)
            {
                l3 = nd; // first node of result list
                t3 = nd;
            } 
            else
            {
                t3.next = nd; // attach to result list
                t3 = t3.next;
            }
        }

        // if carry is left after processing both lists
        if(carry > 0)
        {
            t3.next = new ListNode(carry);
        }

        return l3; // return head of result
    }
}
