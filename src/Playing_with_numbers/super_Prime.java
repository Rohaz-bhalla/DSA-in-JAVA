package Playing_with_numbers;

public class super_Prime 
{
    public static void main(String[] args) 
    {
        int n = 41;

        System.out.println( superPrime( n ) );
    }

    static boolean superPrime( int n )
    {
        if( !isPrime( n ) )
        {
            return false;
        }

        int count = 0;

        for( int i = 2; i <= n; i++ )
        {
            if( isPrime( i ) )
            {
                count ++;
                if( i == n )
                {
                    break;
                }
            }
        }
        return isPrime(count);
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
