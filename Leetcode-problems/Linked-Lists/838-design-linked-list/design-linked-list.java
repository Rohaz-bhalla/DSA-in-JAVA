class MyLinkedList {

    private class Node
    {
        int val;
        Node prev;
        Node next;
        Node( int val )
        {
            this.val = val;
        }
    }

    private Node head;
    private Node tail;

    public MyLinkedList() 
    {
        head = null;
        tail = null;
    }
    
    public int get(int index) 
    {
        if( index < 0 ) return -1;

        else
        {
            Node t = head;
            int i = 0;
            boolean found = false;

            while( t != null )
            {
                if( i == index )
                {
                    found = true;
                    break;
                }
                else
                {
                    t = t.next;
                    i++;
                }
            }
            if (found) return t.val;   //should return node value
            else return -1;
        }
    }
    
    public void addAtHead(int val) 
    {
        if( head == null )
        {
            head = new Node( val ); // list empty ha toh jo pehla node dala vohi head vohi tail
            tail = head;
        }
        else // if list is not empty
        {
            Node nd = new Node( val );
            nd.next = head; // new node bna ke head ke piche rkh dia
            head.prev = nd;
            head = nd;
        }
    }
    
    public void addAtTail(int val) 
    {
         if( head == null )
        {
            head = new Node( val ); // list empty ha toh jo pehla node dala vohi head vohi tail
            tail = head;
        }
        else
        {
            Node nd = new Node( val );
            tail.next = nd; // new node bna ke head ke piche rkh dia
            nd.prev = tail;
            tail = nd;
        }
    }
    
    public void addAtIndex(int index, int val) 
{
    if (index < 0) return;

    if (index == 0) {
        addAtHead(val);
        return;
    }

    Node t = head;
    int i = 0;

    while (t != null && i < index - 1) {
        t = t.next;
        i++;
    }

    if (t == null) {
        return; // index out of bounds  do nothing

    } else if (t.next == null) {
        addAtTail(val); // if inserting at end
        
    } else {
        Node nd = new Node(val);
        nd.next = t.next;
        nd.prev = t;
        t.next.prev = nd;
        t.next = nd;
    }
}

    
     public void deleteAtIndex(int index) {
        if (index < 0) {
            return; // do nothing
        } 
        else if (index == 0) {
            if (head != null) {
                head = head.next;
                if (head != null) head.prev = null; //maintain prev
                else tail = null; // list became empty
            }
        } 
        else {
            Node t = head;
            int i = 0;
            while (t != null) {
                if (i == index - 1) {
                    break;
                } else {
                    t = t.next;
                    i++;
                }
            }
            if (t != null && t.next != null) { 
                t.next = t.next.next;
                if (t.next != null) t.next.prev = t; 
                else tail = t; //maintain tail
            }
        }
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */