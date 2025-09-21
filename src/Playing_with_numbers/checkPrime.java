package Playing_with_numbers;

public class checkPrime 
{
    public static void main(String[] args) 
    {
        int n = 11;
        System.out.println( isPrime( n ) );
    }

    static boolean isPrime( int n )
    {
        if( n == 1 )
        {
            return false;
        }

        int flag = 0;
        
        for( int i = 2; i <= Math.sqrt(n); i++ )
        {
            if( n % i == 0 )
            {
                flag = 1;
                break;
            }
        }
        if( flag == 0 )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
