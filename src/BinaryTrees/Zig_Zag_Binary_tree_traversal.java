package BinaryTrees;

import java.util.*;

public class Zig_Zag_Binary_tree_traversal {
    public static void main(String[] args) {
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

        System.out.println(zigzagLevelOrder(bst.root));
    }

    static public List<List<Integer>> zigzagLevelOrder(treeNode t) {

        List<List<Integer>> main_list = new ArrayList<>();

        int height = getHeight(t);

        for (int k = 0; k <= height - 1; k++) {
            printElementsAt(t, k, main_list);
            // System.out.println("\n-------------------");
        }

        return main_list;
    }

    static void printElementsAt( treeNode t, int level, List<List<Integer>> main_list) {
        List<Integer> al = new ArrayList<>();

        inOrder(t, 0, level, al);

        // System.out.println(al);

        main_list.add(al);
    }

    static void inOrder( treeNode t, int i, int level, List<Integer> al) {
        if (t == null) {
            // do nothing
        } else if (i == level) {
            // System.out.print(t.val+" ");
            if (i % 2 == 0) {
                al.add(t.val); // add element in FWD
            } else {
                al.add(0, t.val); // add element in BACKWARD
            }

        } else {
            inOrder(t.left, i + 1, level, al);
            inOrder(t.right, i + 1, level, al);
        }
    }
    
    static int getHeight( treeNode t )
    {
        if( t == null )
        {
            return 0;
        }
        else
        {
            int leftHeight  = 1 + getHeight( t.left );
            int rightHeight = 1 + getHeight( t.right );

            return Math.max(leftHeight, rightHeight);
        }
    }
}