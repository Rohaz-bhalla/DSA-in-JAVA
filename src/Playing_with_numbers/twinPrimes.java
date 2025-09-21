package Playing_with_numbers;

public class twinPrimes 
{
    public static void main(String[] args) 
    {
        twinPrime( 1, 100 );
    }

    static void twinPrime( int L, int U )
    {
        for( int i = L; i <= U; i++ )
        {
            if( isPrime( i ) && isPrime( i + 2 ) )
            {
                System.out.println( i + " " + ( i + 2 ) ); //braces used bcz to equate i and (i+2) separately otherwise it will concade them
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

