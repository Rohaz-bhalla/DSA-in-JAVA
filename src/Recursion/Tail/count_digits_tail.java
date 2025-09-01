package Recursion.Tail;

public class count_digits_tail 
{
    public static void main(String[] args) {
        countDigits( 987654321, 0 );
    }

    static void countDigits( int n, int count )
    {
        if( n == 0 )
        {
            System.out.println( count );
        }
        else
        {
            int r = n % 10;
            countDigits(n / 10, count + 1 );
        }
    }
}
