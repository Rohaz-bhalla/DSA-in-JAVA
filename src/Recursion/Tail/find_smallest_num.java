package Recursion.Tail;

public class find_smallest_num 
{
    public static void main(String[] args) 
    {
        smallestNum( 62864829, 10 );
    }

    static void smallestNum( int n, int small )
    {
        if( n == 0 )
        {
            System.out.println(small);
        }
        else
        {
            int r = n % 10;

            if( r < small )
            {
                small = r;
            }
            smallestNum(n / 10, small);
        }
    }
}
