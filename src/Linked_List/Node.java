package Linked_List;

    public class Node
    {
        int val; // every node has a value/data
        Node next; // every node has a pointer/ reference to point another node

        Node(int val) // constructor
        {
            this.val = val; // node nd main value dalne ke liye
            next = null; // by default node doesn't point any other node 
        }
    }
    // syntax => Node nd = new Node(10);
    
