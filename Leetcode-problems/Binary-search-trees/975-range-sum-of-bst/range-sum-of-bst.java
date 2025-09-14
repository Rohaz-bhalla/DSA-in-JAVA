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
    public int rangeSumBST(TreeNode root, int low, int high) 
    {
        ArrayList<Integer> al = new ArrayList<>();
        inOrder( root, al );

        int sum = 0;

        for( int val : al )
        {
            if( val >= low && val <= high )
            {
                sum +=val;
            }
        }
            return sum;
    }
    private void inOrder( TreeNode t, ArrayList<Integer> al )
    {
        if( t == null ) return;

        inOrder( t.left, al );
        al.add( t.val );
        inOrder( t.right, al );
    }
}