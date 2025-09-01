package Recursion.Head;

public class sum_of_array_head 
{
    public static void main(String[] args) 
    {
        int arr[] = { 10,20,30 };
        System.out.println( sumOfArray( arr, arr.length-1 ) );
    }

    static int sumOfArray( int arr[], int i )
    {
        if( i == 0 )
        {
            return arr[0];
        }
        else
        {
            return arr[i] + sumOfArray(arr, i - 1);
        }
    } 
}
