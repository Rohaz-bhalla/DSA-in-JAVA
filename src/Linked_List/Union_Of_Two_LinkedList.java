package Linked_List;


import java.util.*;

public class Union_Of_Two_LinkedList 
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
        
        Node start3 = union(ll1.start, ll2.start);
        printList(start3);
    }
    
    static Node union(Node start1, Node start2)
    {
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        
        Node t1 = start1;
        
        while(t1!=null)
        {
            hs.add(t1.val);
            t1 = t1.next;
        }
        
        Node t2 = start2;
        
        while(t2!=null)
        {
            hs.add(t2.val);
            t2 = t2.next;
        }
        
        System.out.println(hs);
        
        Node start3 = null;
        
        Node t3 = start3;
        
        for(int p: hs)
        {
            Node nd = new Node(p);
            
            if(start3==null)    // add as first node
            {
                start3 = nd;
                t3 = nd;
            }
            else               // add more nodes
            {
                t3.next = nd;
                t3 = nd;
            }
        }
        
        
        return start3;
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

// this question Gave a TLE in GFG also GFG asked for ans in an array 

/*
 * The GFG compatible ans
 * 
 * 
 * /*
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
*/

/* 
// class Solution {
    public static Node findUnion(Node head1, Node head2) 
    {
        TreeSet<Integer> ts = new TreeSet<>();
        
        Node t1 = head1;
        
        while( t1 != null )
        {
            ts.add( t1.data );
            t1 = t1.next;
        }
        
        Node t2 = head2;
        
        while( t2 != null )
        {
            ts.add( t2.data );
            t2 = t2.next;
        }
        
        
        Node head3 = null;
        Node t3 = head3;
        
        for( int p : ts )
        {
        Node nd  = new Node( p );
            
        if( head3 == null )
        {
            
            head3 = nd;
            t3 = nd;
            
        }else
        {
            t3.next = nd;
            t3 = nd;
        }
        }
        
        return head3;
        
    }
}
 */