package Tree_Recursion;

public class fibonacci 
{
    public static void main(String[] args) 
    {
        int n = 10;

        System.out.println(fibo(n));
    }

    static int fibo( int n )
    {
        if( n == 1 )
        {
            return 0;
        }
        else if( n == 2 )
        {
            return 1;
        }
        else
        {
            return fibo( n - 1 ) + ( n - 2 );
        }
    }
}
