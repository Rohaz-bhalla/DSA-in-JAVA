package Recursion.Tail;

public class Power_tail 
{
    public static void main(String[] args) 
    {
        int x = 2;
        int y = 5;

        power( x, y, 1 );
    }

    static void power( int x, int y, int val )
    {
        if( y == 0 )
        {
            val = val * 1;
            System.out.println( val );
        }
        else
        {
            val = val * x;
            power(x, y - 1, val);
        }
    }
}
