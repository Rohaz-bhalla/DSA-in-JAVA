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
    public int getMinimumDifference(TreeNode root) 
    {
        ArrayList<Integer> al = new ArrayList<>();
        inOrder( root, al );

        int large = Integer.MAX_VALUE; // 2^31-1
        for( int i = 1; i <= al.size() - 1; i++ )
        {
            int small = ( al.get( i ) - al.get( i - 1 ) ); // minus from ek ageh ajek then minus prev idx
            large = Math.min( large, small );
        }
        return large;
    }

    private void inOrder( TreeNode t, ArrayList<Integer> al )
    {
        if( t == null ) return;

        inOrder( t.left, al );
        al.add( t.val );
        inOrder( t.right, al );
    }
}