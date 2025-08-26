package Linked_List;

public class reverse_LinkedList_3 
{public static void main(String[] args) 
    {
        MyLinkedList ll = new MyLinkedList();
        
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        
        printList(ll.start); 
        Node start2 = reverse(ll.start);
        
        printList(start2);
    }


    static Node reverse( Node start )
    {
        if( start == null || start.next == null ) return null;

        Node t1,t2,t3;

        t1 = null;
        t2 = start;
        t3 = start.next;

        while( true )
        {
            t2.next = t1;

            t1 = t2;
            t2 = t3;

            if( t2 == null ) break;

            t3 = t3.next;
        }
        start = t1;
        return start;
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
