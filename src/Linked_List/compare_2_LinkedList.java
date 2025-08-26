package Linked_List;

public class compare_2_LinkedList 
{
    public static void main(String[] args) 
    {
        MyLinkedList ll1 = new MyLinkedList();
        ll1.add(10);
        ll1.add(20);
        ll1.add(30);
        
        MyLinkedList ll2 = new MyLinkedList();
        ll2.add(20);
        ll2.add(25);
        ll2.add(30);
        ll2.add(45);
        
        boolean result = identical_LinkedList(ll1.start, ll2.start);
        System.out.println("Are they identical? " + result);

    printList(ll1.start);
    printList(ll2.start);
    }

    static boolean identical_LinkedList( Node start1, Node start2 )
    {
        Node t1 = start1;
        Node t2 = start2;

        while ( t1 != null  && t2 != null ) 
        {
            if( t1.val != t2.val )
            {
                return false;
            }
            t1 = t1.next;
            t2 = t2.next;
        }
        return( t1 == null && t2 == null ); // if both loops ends together means they are identical
    }

    static void printList( Node start )
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
