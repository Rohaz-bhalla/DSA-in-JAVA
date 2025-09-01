package Recursion.Head;

public class find_smallest_head 
{
    public static void main(String[] args) {
        System.out.println( findSmall( 8739832 ) );
    }

    static int findSmall( int n )
    {
        if( n == 0 )
        {
            return 10;
        }
        else
        {
            int r = n % 10;

            int ans = n / 10;

            return Math.min(r, ans);
        }
    }
}
