package Recursion.Head;

public class count_digits_head 
{
    public static void main(String[] args) {
        System.out.println( countDigits( 987654321 ) );
    }

    static int countDigits( int n )
    {
        if( n == 0 )
        {
            return 0;
        }
        else
        {
            return 1 + countDigits( n/10 );
        }
    }
}
