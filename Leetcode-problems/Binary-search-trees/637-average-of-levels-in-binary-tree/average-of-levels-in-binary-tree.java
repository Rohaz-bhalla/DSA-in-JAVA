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
    public List<Double> averageOfLevels(TreeNode root) 
    {
        ArrayList<Double> al = new ArrayList<>();
        if( root == null )
        {
            return al;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add( root );

        while( !q.isEmpty() )
        {
            int n = q.size();

            double total = 0.0;

            for( int i = 0; i <= n - 1; i++ )
            {
                TreeNode node = q.poll();
                if( node.left != null )
                {
                    q.add( node.left );
                }
                
                if( node.right != null )
                {
                    q.add( node.right );
                }
                total += node.val;
            }
         al.add( total / n );
        }
        return al;
    }
}