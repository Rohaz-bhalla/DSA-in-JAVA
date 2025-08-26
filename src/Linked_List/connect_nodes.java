package Linked_List;

public class connect_nodes 
{
    public static void main(String[] args) 
    {
        Node Start;

        Node nd1 = new Node(10);
        Node nd2 = new Node(20);
        Node nd3 = new Node(30);
        Node nd4 = new Node(40);

        Start = nd1;
        nd1.next = nd2;
        nd2.next = nd3;
        nd3.next = nd4;

        Node t = Start; // defined the traversal pointer

        while( t != null ) // if traversal pointer is not null(pointing towards a node) then -> t = t.next
        {
            System.out.print( t.val + "-->" );
            t = t.next;
        }

        System.out.print("X");

    }
}
