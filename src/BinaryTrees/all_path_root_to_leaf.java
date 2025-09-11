package BinaryTrees;

public class all_path_root_to_leaf 
{
    public static void main(String[] args) 
    {
        MyBinarySearchTree bst = new MyBinarySearchTree();

        bst.add(50);
        bst.add(40);
        bst.add(60);
        
        bst.add(30);
        bst.add(35);
        bst.add(20);
        bst.add(10);
        bst.add(15);
        bst.add(70);
        
        bst.add(80);
        bst.add(90);
        bst.add(85);
        bst.add(75);

        System.out.println( "All Paths from root to leaf :" );
        allPaths( bst.root, " " );
    }

    static void allPaths( treeNode t, String ans )
    {
        if( t == null )
        {

        }

        else if( t.left == null && t.right == null )
        {
            System.out.println( ans + "-->" + t.val ); //root -> leaf
           // System.out.println( t.val + "-->" + ans ); //leaf -> root
        }

        else
        {
            ans = ans + t.val + "-->"; // for root -> leaf
            //ans = t.val + "-->" + ans; // for leaf -> root

            allPaths(t.left, ans);
            allPaths(t.right, ans);
        }
    }
} 
