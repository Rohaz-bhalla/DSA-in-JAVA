package Recursion.Head;

public class isArray_sorted_head 
{
    public static void main(String[] args) {
        int arr [] = { 1,2,3,6,5 };

        System.out.println( isSorted( arr, 0 ) );
    }

    static boolean isSorted( int arr[], int i )
    {
        if( i == arr.length - 1 )
        {
            return true;
        }
        else
        {
            boolean ans = isSorted(arr, i + 1 );
            return (arr[i] < arr[ i + 1 ]) && ans;
        }
    }
}
