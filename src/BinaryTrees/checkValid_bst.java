package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class checkValid_bst //lc 98
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

        System.out.println( isValid( bst.root ) );
    }

    static boolean isValid( treeNode t )
    {
        ArrayList<Integer> al = new ArrayList<>();

        inOrder( t, al );

        System.out.println( al );

        boolean sorted = true;

        for( int i = 0; i <= al.size() - 2; i++ ) // -2 bcz its comparing with last index i+1
        {
            if( al.get(i) < al.get(i + 1) )
            {

            }
            else
            {
                sorted = false;
                break;
            }
        }
        return sorted;
    }

    static void inOrder( treeNode t, List<Integer> al)
    {
        if(t==null)
        {
            // do nothing
        }
        else
        {
            inOrder(t.left, al);
            
            al.add(t.val);
            
            inOrder(t.right, al);
        }
    }
}
