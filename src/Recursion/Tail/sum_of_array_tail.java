package Recursion.Tail;

public class sum_of_array_tail 
{
    public static void main(String[] args) 
    {
        int arr[] = { 10,20,30 };
        sumOfArray( arr, arr.length-1, 0 );
    }

    static void sumOfArray( int arr[], int i , int sum )
    {
        if( i == -1 )
        {
            System.out.println( sum );
        }
        else
        {
            sum = sum + arr[i];
            sumOfArray(arr, i - 1, sum);
        }
    }
}
