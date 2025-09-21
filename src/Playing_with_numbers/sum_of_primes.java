package Playing_with_numbers;

public class sum_of_primes 
{
    public static void main(String[] args) 
    {
        int n = 41;

        System.out.println( sumPrimes( n ) );
    }

    static boolean sumPrimes( int n )
    {
        int sum = 0, 
            i = 1;

            boolean flag = false;

            while ( true ) 
            {
                i = findNextPrime( i );
                System.out.println( "Next Prime --> " + i );

                sum = sum + i;

                if( sum == n )
                {
                    flag = true;
                    break;
                }
                else if( sum > n )
                {
                    break;
                }
            }
            return flag;
    }

        static int findNextPrime( int n )
    {
        int i;

        for( i = n + 1; ;i++ )
        {
            if( isPrime( i ) )
            {
                break;
            }
        }
        return i;
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
