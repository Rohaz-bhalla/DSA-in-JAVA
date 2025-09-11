package BinaryTrees;

public class level_order_traversal 
{
    public static void main(String[] args) 
    {
        MyBinarySearchTree bst = new MyBinarySearchTree();

        bst.add(50);
        bst.add(40);
        bst.add(60);
        bst.add(30);
        bst.add(35);
        bst.add(10);
        bst.add(45);
        bst.add(70);
        bst.add(90); 

        bfs( bst.root );
    }

    static void bfs( treeNode t )
    {
        int height = getHeight( t );

        for( int k = 0; k <= height - 1; k++ )
        {
            elements( t, k );
            System.out.println( "\n----------" );
        }
    }

    static void elements( treeNode t, int level )
    {
        inOrder( t, 0, level );
    }

    static void inOrder( treeNode t, int i, int level )
    {
        if( t == null )
        {
            //
        }
        else if( i == level )
        {
            System.out.println( t.val + " " );
        }
        else
        {
            inOrder(t.left, i + 1, level);
            inOrder(t.right, i + 1, level);
        }
    }

        static int getHeight( treeNode t )
    {
        if( t == null )
        {
            return 0;
        }
        else
        {
            int leftHeight  = 1 + getHeight( t.left );
            int rightHeight = 1 + getHeight( t.right );

            return Math.max(leftHeight, rightHeight);
        }
    }
}
