package Recursion.Tail;

public class Binary_search_tail 
{
    public static void main(String[] args) 
    {
        int arr [] = { 10,20,30,40,50,60 };
        binarySearch( arr, 30, 0, arr.length-1 );
    }

    static void binarySearch( int arr[], int num, int low, int high )
    {
        
        if( low > high )
        {
            System.out.println( "Not found" );
            return;
        }
        
        int m = ( low + high ) / 2;

        if( arr[m] == num )
        {
            System.out.println( "Found at" + m );
            return;
        }

         if (num < arr[m])   // left side me search
        {
            binarySearch(arr, num, low, m - 1);
        }
        else   // right side me search
        {
            binarySearch(arr, num, m + 1, high);
        }
    }    
}
