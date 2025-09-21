package Playing_with_numbers;

public class nextPrime 
{
    public static void main(String[] args) 
    {
        int n = 17;
        
        System.out.println( findNextPrime( n ) );
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
