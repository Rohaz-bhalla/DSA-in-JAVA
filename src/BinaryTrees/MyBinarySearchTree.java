package BinaryTrees;

public class MyBinarySearchTree 
{
        treeNode root;


        void add( int val )
        {
            if( isEmpty() ) // add first node
            {
                treeNode nd = new treeNode(val);
                root = nd;
                System.out.println( val + "added as first Node" );
            }
            else // add more
            {
                treeNode t = root;

                while( true )
                {
                    if( val < t.val )
                    {
                        if( t.left == null ) // space is available
                        {
                            treeNode nd = new treeNode(val); //attach
                            t.left = nd;
                            System.out.println( val + " added to the left of" + t.val );
                            break;
                        }
                        else
                        {
                            t = t.left; // already have a left node so simply go left node niche ko 
                        }
                    }
                    else if( val > t.val )
                    {
                        if( t.right == null )
                        {
                            treeNode nd = new treeNode(val);
                            t.right = nd;
                            System.out.println( val + "added to the right of"+ t.val );
                            break;
                        }
                        else
                        {
                            t = t.right;
                        }
                    }
                    else if( val == t.val ) //duplicate
                    {
                        // do nothing
                        System.out.println( val + "duplicate item, ignored" );
                        break;
                    }
                }
            }
        }

        boolean isEmpty()
        {
            if( root == null )
            {
                return true;
            }
            else
            {
                return false;
            }
        }

        void createTree()
        {
            treeNode t1 = new treeNode(50);
            treeNode t2 = new treeNode(40);
            treeNode t3 = new treeNode(60);

            root = t1;
            t1.left = t2;
            t1.right = t3;
        }

        void inOrder( treeNode t )
        {
            if( t == null )
            {
                //
            }
            else
            {
                inOrder( t.left );

                System.out.println( t.val + " " );

                inOrder( t.right );
            }
        }

        void preOrder( treeNode t )
        {
            if( t == null )
            {

            }
            else
            {
                System.out.println( t.val + " " );
                preOrder( t.left );
                preOrder( t.right );
            }
        }

        void postOrder( treeNode t )
        {
            if( t == null )
            {

            }
            else
            {
                postOrder(t.left);
                postOrder(t.right);
                System.out.println(t.val + " ");
            }
        }
}

