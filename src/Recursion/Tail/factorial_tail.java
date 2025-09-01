package Recursion.Tail;

public class factorial_tail 
{
    public static void main(String[] args) 
    {
        int n = 4;
        factorial( n, 1 ); // perform calc from n and ans till now is 1
    }

    static void factorial( int n, int ans )
    {
        if( n == 0 )
        {
            System.out.println( ans );
        }
        else
        {
            ans = ans * n;
            factorial(n - 1, ans);
        }
    }
}
