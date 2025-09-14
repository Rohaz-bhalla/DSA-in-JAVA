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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) 
    {
        List<List<Integer>> ansList = new ArrayList<>();
        int height = getHeight( root );

        for( int k = 0; k <= height - 1; k++ )
        {
            elements( root, k, ansList );
        }
        return ansList;
    }

    static void elements( TreeNode t, int level, List<List<Integer>> ansList )
    {
        List<Integer> al = new ArrayList<>();
        inOrder( t, 0, level, al );
        ansList.add( al );                     
    }
    
    static void inOrder( TreeNode t, int i, int level, List<Integer> al )
    {
        if( t == null )
        {
            return;                           
        }
        else if( i == level )
        {
            if( level % 2 == 0 )               
            {
                al.add( t.val );
            }
            else
            {
                al.add( 0, t.val );
            }
        }
        else
        {
            inOrder( t.left , i + 1, level, al );
            inOrder( t.right, i + 1, level, al );
        }
    }

    static int getHeight( TreeNode t )
    {
        if( t == null ) return 0;

        int leftHeight  = 1 + getHeight( t.left );
        int rightHeight = 1 + getHeight( t.right );

        return Math.max( leftHeight, rightHeight );
    }
}
