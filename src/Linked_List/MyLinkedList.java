package Linked_List;

public class MyLinkedList 
{
    
    Node start;

    void add(int val)  // adds the element at the end of the list
    {
        if(isEmpty())
        {
            Node nd = new Node(val); // add first node
            start = nd;
            System.out.println( val+ "Added First Node" );
        }else
        {
            Node t = start;

            while ( t.next != null ) // traverse to the end 
            {
                t = t.next;
            }
            Node nd  = new Node(val); // create a new node

            // add to the last
            t.next = nd;
        }
    }

    boolean isEmpty()
    {
        if( start == null )
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    void addFirst(int val)
    {
        Node nd = new Node(val); // for adding value
        nd.next = start;         // connecting one node to another

        System.out.println(val + "Added to the start of the list");
    }

    int size()
    {
        int count = 0;

        Node t= start;

        while ( t != null ) 
        {
            count++;
            t = t.next;
        }
        return count;
    }

    int indexOf(int val)
    {
        if(isEmpty())
        {
            return -1;
        }
        else
        {
            Node t = start;
            int i = 0;
            boolean found = false;

            while ( t != null ) 
            {
                if( t.val == val ) // end tak iterate, if current node value matches the given one
                {
                    found = true;
                    break;
                }
                else
                {
                    t = t.next; // if not found then move to the next index
                    i++; // increase index
                }
            }
            if( found )
            {
                return i;
            }
            else
            {
                return -1;
            }
        }
    }

    void update( int old_val, int new_val )
    {
        Node t = start;

        while( t != null )
        {
            if( t.val == old_val )
            {
                t.val = new_val;
            }
            t = t.next;
        }
    }

    void delete( int index )
    {
        if( isEmpty() )
        {
            // do nothing
        }
        else if( index < 0 || index >= size() )
        {
            //do nothing
        }
        else if( index == 0 ) // for deleting the first node... we are moving the start to the second node
        {
            start = start.next;
        }
        else
        {
            // traverse and stop 1 index before
            Node t = start;
            int i = 0; // keeps the track of the index

            while ( t != null ) 
            {
                if( i == index-1 ) // for deleting we have to stop 1 index before so -1 
                {
                    break;
                }
                t = t.next;
                i++;
            }
            // now skip the element by changing the reference.. agle se agla
            t.next = t.next.next;
        }
    }

    void printList()
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
