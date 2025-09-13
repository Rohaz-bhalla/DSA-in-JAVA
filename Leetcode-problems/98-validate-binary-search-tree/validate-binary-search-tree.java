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
    public boolean isValidBST(TreeNode root) 
    {
        ArrayList<Integer> al = new ArrayList<>();
        inOrder( root, al );

        for( int i = 0; i <= al.size() - 2; i++ )
        {
            if( al.get( i ) >= al.get( i + 1 ) ) return false;

        }
            return true;
    }

    static void inOrder( TreeNode t, ArrayList<Integer> al )
    {
        if( t == null ) return;

        inOrder( t.left, al );
        al.add( t.val );
        inOrder( t.right, al );
    }
}