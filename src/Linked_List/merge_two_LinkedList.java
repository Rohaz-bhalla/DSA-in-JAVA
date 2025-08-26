package Linked_List;

public class merge_two_LinkedList 
{
    public static void main(String[] args) 
    {
        MyLinkedList ll1 = new MyLinkedList();
        ll1.add(10);
        ll1.add(20);
        ll1.add(30);
        ll1.add(40);
        ll1.add(50);

        MyLinkedList ll2 = new MyLinkedList();
        ll2.add(60);
        ll2.add(70);
        ll2.add(80);
        ll2.add(90);
        ll2.add(100);

        Node start3 = merge( ll1.start, ll2.start );
        printList( start3 );
    }

    static Node merge( Node start1, Node start2 )
    {
        Node t = start1;

        while ( t.next != null ) 
        {
            t = t.next;
        }
        t.next = start2;

        return start1;
    }

    static void printList( Node start )
    {
        Node t = start;
        while ( t != null ) 
        {
            System.out.print(t.val + "--->");
            t = t.next;
        }
        System.err.print("X");
    }
}
