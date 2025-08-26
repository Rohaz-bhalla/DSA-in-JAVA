package Linked_List;

public class Merge_Two_Sorted_LinkedList_Leetcode_21 
{
    public static void main(String[] args) 
    {
        // First Linked List: 10 -> 20 -> 30
        MyLinkedList ll1 = new MyLinkedList();
        ll1.add(10);
        ll1.add(20);
        ll1.add(30);
        
        // Second Linked List: 15 -> 25 -> 35 -> 45
        MyLinkedList ll2 = new MyLinkedList();
        ll2.add(15);
        ll2.add(25);
        ll2.add(35);
        ll2.add(45);
        
        // Merge both sorted linked lists into a new sorted list
        Node start3 = mergeTwoLists(ll1.start, ll2.start);
        
        // Print the merged list
        printList(start3);
    }
    
    // Function to merge two sorted linked lists
    public static Node mergeTwoLists(Node start1, Node start2) 
    {
        // CASE 1: both lists are empty
        if(start1==null && start2==null)
        {
            return null;
        }
        // CASE 2: only first list has elements
        else if(start1!=null && start2==null)
        {
            return start1;
        }
        // CASE 3: only second list has elements
        else if(start1==null && start2!=null)
        {
            return start2;
        }
        // CASE 4: both lists have elements
        else 
        {
            Node start3 = null;   // Head of new merged list
            Node t1 = start1;     // Pointer for list 1
            Node t2 = start2;     // Pointer for list 2
            Node t3 = start3;     // Pointer for merged list
            
            // Merge until one list gets completely traversed
            while(true)
            {
                if(t1.val < t2.val)   // Pick smaller element
                {
                    Node nd = new Node(t1.val);  // Create new node with t1's value
                    
                    if(start3==null)  // If merged list is empty, first node
                    {
                        start3 = nd;
                        t3 = nd;
                    }
                    else              // Otherwise attach new node at the end
                    {
                        t3.next = nd;
                        t3 = nd;
                    }
                    
                    t1 = t1.next;     // Move pointer in first list
                    
                    if(t1==null)      // If first list ends, break
                    {
                        break;
                    }
                }
                else   // If t2.val <= t1.val
                {
                    Node nd = new Node(t2.val); // Create node from list 2
                    
                    if(start3==null)   // First node of merged list
                    {
                        start3 = nd;
                        t3 = nd;
                    }
                    else               // Attach at the end
                    {
                        t3.next = nd;
                        t3 = nd;
                    }
                    
                    t2 = t2.next;      // Move pointer in second list
                    
                    if(t2==null)       // If second list ends, break
                    {
                        break;
                    }
                }
            }
            
            // At this point, one list has ended.
            
            // If first list ended, copy remaining elements of second list
            if(t1==null)
            {
                while(t2!=null)
                {
                    Node nd = new Node(t2.val);
                    
                    t3.next = nd;
                    t3 =  nd;
                    
                    t2 = t2.next;
                }
            }
            // Else if second list ended, copy remaining elements of first list
            else
            {
                while(t1!=null)
                {
                    Node nd = new Node(t1.val);
                    
                    t3.next = nd;
                    t3 =  nd;
                    
                    t1 = t1.next;
                }
            }
            
            // Return head of new merged sorted list
            return start3;
        }
    }
    
    // Helper function to print a linked list
    static void printList(Node start)
    {
        Node t = start;
        
        System.out.print("start -->");
        while(t!=null)
        {
            System.out.print(t.val+" --> ");
            t = t.next;
        }
        System.out.println("X");
    }
}
