package Playing_with_numbers;

import java.math.BigInteger;

public class big_integer 
{
    public static void main(String[] args) 
    {
        BigInteger a = new BigInteger( "12345678909876543210");
        BigInteger b = new BigInteger("98798776576565465454343");

        BigInteger c = a.add( b );

        System.out.println( c );

        BigInteger d = a.multiply( b );

        System.out.println( d );
    }
}
