package Recursion.Head;

public class Power_head 
{
    public static void main(String[] args) 
    {
        int x = 2;
        int y = 5;

        System.out.println( power( x, y ) );
    }
    
    static int power( int x, int y )
    {
        if( y == 0 )
        {
            return 1;
        }
        else
        {
            return x * power(x, y - 1);
        }
    }
}
