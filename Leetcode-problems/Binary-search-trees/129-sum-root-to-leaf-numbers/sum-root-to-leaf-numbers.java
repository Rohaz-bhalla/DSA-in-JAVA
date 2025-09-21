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

    int sum = 0;

    public int sumNumbers(TreeNode root) 
    {
        preOrder( root, 0 );
        return sum;
    }

    private void preOrder( TreeNode t, int currNum )
    {
        if( t == null )
        {
            return;
        }
        currNum = currNum * 10 + t.val;

        if( t.left == null && t.right == null ) // reached at end means at leaf
        {
            sum += currNum;
        }

        preOrder( t.left, currNum );
        preOrder( t.right, currNum );
    }
}