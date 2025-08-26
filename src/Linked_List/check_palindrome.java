package Linked_List;

public class check_palindrome 
{
    public static void main(String[] args) 
    {
        MyLinkedList ll1 = new MyLinkedList();
        ll1.add(10);
        ll1.add(20);
        ll1.add(20);
        ll1.add(10);
        
        boolean result = isPalindrome(ll1.start);
        System.out.println("Are They Palindrome? " + result);

    printList(ll1.start);
    }

    static boolean isPalindrome( Node start)
    {
        Node start2 =reverse(start); // here start means we reversed orig list

        if(identical_LinkedList(start, start2) ) // here start means orig and start2 means other list(reversed coming from above line) which is to be compared
        {
            return true;
        }else
        {
            return false;
        }
    }

    static Node reverse(Node start)
    {
        Node t = start;
        Node start2 = null;

        while (t != null) 
        {
            int val = t.val;

            Node nd  = new Node(val);
            nd.next = start2;
            start2 = nd;

            t = t.next;
        }
        return start2;
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
