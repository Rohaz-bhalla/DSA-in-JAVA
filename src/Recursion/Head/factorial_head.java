package Recursion.Head;

public class factorial_head 
{
    public static void main(String[] args) 
    {
        int n = 4;

        System.out.println( factorial( n ) );
    }

    static int factorial( int n )
    {
        if( n == 0 )
        {
            return 1;
        }
        else
        {
            return n * factorial(n - 1);
        }
    }
}
