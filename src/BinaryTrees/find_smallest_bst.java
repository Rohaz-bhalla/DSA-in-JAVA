package BinaryTrees;

public class find_smallest_bst 
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

        System.out.println( smallestElement(bst.root) );
    }

    static int smallestElement( treeNode t )
    {
        while( t.left != null )
        {
            t = t.left;
        }
        return t.val;
    }
}
