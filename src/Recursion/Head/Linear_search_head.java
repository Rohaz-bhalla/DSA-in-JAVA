package Recursion.Head;

public class Linear_search_head 
{
    public static void main(String[] args) 
    {
        int arr [] = { 10,20,30,40,50 };
        System.out.println( search( arr, 60, 0, false ) );
    }

    static int search( int arr[], int num, int i, boolean found )
    {
        if( found == true )
        {
            return ( i-1 );
        }
        else if( i == arr.length )
        {
            return -1;
        }
        else
        {
            if( num == arr[i] )
            {
                found = true;
            }
            return search(arr, num, i + 1 , found);
        }
    }
}
