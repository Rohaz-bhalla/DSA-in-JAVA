package Recursion.Head;

public class sum_first5_no_head 
{
    public static void main(String[] args) 
    {
        System.out.println( sumOfNum( 5 ) );
    }

    static int sumOfNum( int n )
    {
        if( n == 0 )
        {
            return 0;
        }
        else
        {
            return n + sumOfNum(n - 1);
        }
    }
}
