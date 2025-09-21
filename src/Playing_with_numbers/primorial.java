package Playing_with_numbers;

public class primorial 
{
    public static void main(String[] args) 
    {
        int n = 13;

        System.out.println( findPrimorial( n ) );
    }

    static int findPrimorial( int n )
    {

        int factorial = 1;

        for( int i = n; i >= 1; i-- )
        {
            if( isPrime( i ) )
            {
                factorial = factorial * i;
            }
        }
        return factorial;
    }

    static boolean isPrime( int n )
    {
        if( n == 1 )
        {
            return false;
        }
        
        for( int i = 2; i <= Math.sqrt(n); i++ )
        {
            if( n % i == 0 )
            {
                return false; // num is getting divide
            }
        }
        return true;
    }
}
