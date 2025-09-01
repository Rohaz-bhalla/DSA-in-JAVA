package Recursion.Head;

public class binary_search_head 
{
    public static void main(String[] args) 
    {
        int arr[] = { 10,20,30,40,50 };
        System.out.println( binarySearch( arr, 50, 0, arr.length-1 ) );
    }

    static int binarySearch( int arr[], int num, int low, int high )
    {
        if( low > high )
        {
            return -1;
        }
        else
        {
            int m = ( low + high ) / 2;

            if( arr[m] == num )
            {
                return m;
            }
            else if( arr[m] > num )
            {
                return binarySearch(arr, num, low, m-1);
            }
            else
            {
                return binarySearch(arr, num, m+1, high);
            }
        }
    }
}
