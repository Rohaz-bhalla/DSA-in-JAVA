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
    public List<String> binaryTreePaths(TreeNode root) 
    {
        ArrayList<String> al = new ArrayList<>();
        dfs( root, "", al );
        return al;
    }

    private void dfs( TreeNode root, String ans, ArrayList<String> al )
    {
        if( root == null ) return;
        
        if( ans.isEmpty() )
        {
            ans = String.valueOf( root.val ); // converts int to string.. 5 => "5"
        }
        else
        {
            ans += "->" + root.val;
        }

        if( root.right == null && root.left == null )
        {
            al.add( ans );
            return;
        }

        dfs( root.left, ans, al );
        dfs( root.right, ans, al );
    }
}