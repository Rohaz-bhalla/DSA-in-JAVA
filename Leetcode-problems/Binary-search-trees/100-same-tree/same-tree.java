/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) 
    {
        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>();

        preOrder( p, l1 );
        preOrder( q, l2 );

        if( ! l1.equals( l2 ) )
        {
            return false;
        }
        return true;

    }

    private void preOrder( TreeNode t, ArrayList<Integer> list)
    {
        if( t == null )
        {
            list.add( null );
            return;
        }

        list.add( t.val );
        preOrder( t.left, list );
        preOrder( t.right, list );
    }
}