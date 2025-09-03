package Tree_Recursion;

public class number_partition 
{
    public static void main(String[] args) 
    {
        int n = 4;
        partition( n );
    }

    static void partition( int n )
    {
        partition( n, "" );
    }

    static void partition( int n, String ans )
    {
        if( n == 0 )
        {
            System.out.println( ans );
        }
        else
        {
            for( int i = 1; i <= n; i++ )
            {
                partition(n - i, ans + i + "");
            }
        }
    }
}
