package Playing_with_numbers;

public class allPrimes 
{
    public static void main(String[] args) 
    {
        prime( 100, 200 );
    }

    static void prime( int L, int U )
    {
        for( int i = L; i <= U; i++ )
        {
            if(isPrime( i ))
            {
                System.out.println( i + " " );
            }
        }
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
