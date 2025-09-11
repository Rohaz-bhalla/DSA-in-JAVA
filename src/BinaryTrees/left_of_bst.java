package BinaryTrees;

import java.util.*;

public class left_of_bst 
{
    public static void main(String[] args) 
    {
        MyBinarySearchTree bst = new MyBinarySearchTree();

        bst.add(50);
        bst.add(40);
        bst.add(60);
        bst.add(30);
        bst.add(35);
        bst.add(10);
        bst.add(45);
        bst.add(70);
        bst.add(90); 

        System.out.println( leftSide( bst.root ) );

    }

    static List<Integer> leftSide( treeNode root )
    {
        ArrayList<Integer> al = new ArrayList<>();
        visit( root.left, al );
        return al;
    }

    static void visit( treeNode t, ArrayList<Integer> al)
    {
        if ( t == null ) 
        {
            //
        }
        else
        {
            visit(t.left, al);

            al.add(t.val);

            visit(t.right, al);
        }
    }
}
