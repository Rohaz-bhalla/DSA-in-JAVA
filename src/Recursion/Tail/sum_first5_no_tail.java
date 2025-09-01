package Recursion.Tail;

public class sum_first5_no_tail 
{
    public static void main(String[] args) 
    {
        sumOfNum( 5,0 );
    }

    static void sumOfNum( int n, int ans )
    {
        if( n == 0 )
        {
            System.out.println( ans );
        }
        else
        {
            ans = ans + n;
            sumOfNum(n - 1, ans);
        }
    }
}
