package Playing_with_numbers;

import java.math.BigInteger;

public class big_integer_2 
{
    public static void main(String[] args) 
    {
        int n = 100; 

        System.out.println( fact( n ) );
    }

    static BigInteger fact( int n )
    {
        BigInteger i;

        BigInteger factorial = new BigInteger("1");

        for( i = new BigInteger("" + n); i.compareTo( new BigInteger("1") ) >= 0; i = i.subtract( new BigInteger( "1" ) ) )
        {
            factorial = factorial.multiply( i );
        }
        return factorial;
    }
}
