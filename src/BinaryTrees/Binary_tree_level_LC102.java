package BinaryTrees;

import java.util.ArrayList;
import java.util.List;

public class Binary_tree_level_LC102 
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

        System.out.println( bfs(bst.root) );
    }

    static List<List<Integer>> bfs(treeNode t)
    {
        List<List<Integer>> main_list = new ArrayList<>();

        int height = getHeight(t);

        // loop level by level
        for (int k = 0; k < height; k++) {
            List<Integer> levelList = new ArrayList<>();
            inOrder(t, 0, k, levelList);
            main_list.add(levelList);   //  add this level into main list
        }

        return main_list;
    }

    // recursive helper for one level
    static void inOrder(treeNode t, int i, int level, List<Integer> al)
    {
        if (t == null) return;

        if (i == level) {
            al.add(t.val);
        } else {
            inOrder(t.left, i + 1, level, al);
            inOrder(t.right, i + 1, level, al);
        }
    }

    static int getHeight(treeNode t)
    {
        if (t == null) return 0;

        int leftHeight  = 1 + getHeight(t.left);
        int rightHeight = 1 + getHeight(t.right);

        return Math.max(leftHeight, rightHeight);
    }
}
