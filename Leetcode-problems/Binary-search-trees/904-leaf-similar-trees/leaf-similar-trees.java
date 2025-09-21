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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) 
    {
        List<Integer> List1 = new ArrayList<>();
        List<Integer> List2 = new ArrayList<>();

        dfs( root1, List1 );
        dfs( root2, List2 );

        if( List1.size() != List2.size() ) return false;

        for( int i = 0; i <= List1.size() - 1; i++ )
        {
            if( ! List1.get( i ).equals(List2.get( i )) ) return false;
        }
        return true;
    }

    private void dfs( TreeNode root, List<Integer> leaf )
    {
        if( root == null ) return;

        if( root.left == null && root.right == null ) // reached at leaf
        {
            leaf.add( root.val );
        }

        dfs( root.left, leaf );
        dfs( root.right, leaf );
    }
}