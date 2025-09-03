package Tree_Recursion;

public class number_partition_noRepeat 
{
    public static void main(String[] args) 
    {
        int n = 5;

        ways( n, n, "" );
    }

    static void ways( int n, int max, String ans )
    {
        if( n == 0 )
        {
            System.out.println(ans);
        }
        else
        {
            for( int i = 1; i <= n; i++ )
            {
                if( i <= max )
                {
                    ways(n - i , i, ans + i + "");
                }
            }
        }
    }
}
