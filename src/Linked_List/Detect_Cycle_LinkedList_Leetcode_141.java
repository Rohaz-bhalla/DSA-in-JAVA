package Linked_List;

public class Detect_Cycle_LinkedList_Leetcode_141 
{
    public boolean hasCycle(Node start) 
    {
    if( start == null || start.next == null ) return false;

          // starting position
            Node slow = start;
            Node fast = start;

        while( fast != null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if( slow == fast ) return true;
        }
        return false;
        
    }
}