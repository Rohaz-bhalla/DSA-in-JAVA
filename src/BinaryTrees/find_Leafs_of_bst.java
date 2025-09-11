package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class find_Leafs_of_bst 
{
    public static void main(String[] args) 
    {
        MyBinarySearchTree bst = new MyBinarySearchTree();

        bst.add(50);
        bst.add(40);
        bst.add(60);
        
        bst.add(30);
        bst.add(35);
        bst.add(20);
        bst.add(10);
        bst.add(15);
        bst.add(70);
        
        bst.add(80);
        bst.add(90);
        bst.add(85);
        bst.add(75);

        System.out.println(leaf( bst.root ));
    }

    static List<Integer> leaf( treeNode t )
    {
        List<Integer> al = new ArrayList<>();
        inOrder( t, al );
        return al;
    }

    static void inOrder( treeNode t, List<Integer> al )
    {
            if( t == null )
            {
                //
            }
            else if( t.left == null && t.right == null )// if no children then its a leaf
            {
                al.add( t.val );
            }
            else
            {
                inOrder( t.left, al );
                inOrder( t.right, al );
            }

    }
}
