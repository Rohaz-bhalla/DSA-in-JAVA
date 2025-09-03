package Tree_Recursion;

public class ways_to_score 
{
    public static void main(String[] args) 
    {
        int N = 5;

        ways( N, "" );
    }

    static void ways( int N, String ans )
    {
        if( N == 0 )
        {
            System.out.println( ans );
        }
        else if( N < 0 )
        {
            //do nothing
        }
        else
        {
            // apni mrzi se values li hai jo sub hori hai
            ways(N - 1, ans + "1");
            ways(N - 3, ans + "3");
            ways(N - 5, ans + "5");
        }
    }
}
