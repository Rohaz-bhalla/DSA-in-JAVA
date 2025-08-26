package Linked_List;

public class Delete_Nth_Node_From_End_Leetcode_19 
{
    public static void main(String[] args) 
    {
        MyLinkedList ll = new MyLinkedList();
        
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        
        Node start2 = removeNthFromEnd(ll.start, 5);
        
        printList(start2);
    }
    
    public static Node removeNthFromEnd(Node start, int k) 
    {
        int l = size(start);
        
        int index = l - k;
        
        if(start==null)
        {
            // do nothing
        }
        else if(index<0 || index>=size(start))
        {
            // do nothing, out of List
        }
        else if(index==0)
        {
            start = start.next;
        }
        else
        {
            // Traverse and Stop 1 index before
            Node t = start;
            int i = 0; // its the pointer on the node which is to be deleted
            
            while(t!=null)
            {
                if(i==index-1) // stop 1 before
                {
                    break;
                }
                
                t = t.next;
                i++;
            }
            
            // Now Skip ith ELement by Changing Reference
            t.next = t.next.next;
        }
        
        return start;
    }
    
    static int size(Node start)
    {
         // Logic
        int count = 0;         
        Node t = start;
        
        while(t!=null)
        {
            count++;
            t = t.next;
        }
        
        return count;   
    } 

    static void printList(Node start)
    {
         // Print LinkedList
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