package Recursion.Tail;

public class isArray_sorted_tail 
{
    public static void main(String[] args) {
        int arr [] = { 1,2,3,4,5,6,7,8 };

        isSorted( arr, 0, true );
    }

    static void isSorted( int arr[], int i, boolean ans )
    {
        if( i == arr.length-1 )
        {
            System.out.println( ans );
        }
        else
        {
            ans = ans && ( arr[i] < arr[ i+1 ] ); // if logic ulta hove then i - 1 use hove ga
            isSorted(arr, i + 1, ans); // moving forward i.e i+1
        }
    }
}
