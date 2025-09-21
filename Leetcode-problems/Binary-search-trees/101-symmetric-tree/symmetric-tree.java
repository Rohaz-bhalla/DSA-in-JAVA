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
    public boolean isSymmetric(TreeNode root) 
    {
        if( root == null ) return true;

        Queue<TreeNode> leftTree = new LinkedList<>();
        Queue<TreeNode> rightTree = new LinkedList<>();

        leftTree.add( root.left );
        rightTree.add( root.right );

        while( !leftTree.isEmpty() && !rightTree.isEmpty() )
        {
            TreeNode leftNode  = leftTree.poll();
            TreeNode rightNode = rightTree.poll();

            if( leftNode == null && rightNode == null ) continue;

            if( leftNode == null || rightNode == null ) return false;

            if( rightNode.val != leftNode.val ) return false;

            leftTree.add( leftNode.left );
            leftTree.add( leftNode.right );

            rightTree.add( rightNode.right );
            rightTree.add( rightNode.left );
        }
        return true;
    }
}