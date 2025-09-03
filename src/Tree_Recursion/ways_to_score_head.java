package Tree_Recursion;

public class ways_to_score_head 
{
    public static void main(String[] args) 
    {
        int N = 5;

        System.out.println( ways( N, "" ) );
    }

    static int ways( int N, String ans )
    {
        if( N == 0 )
        {
            return 1;
        }
        else if( N < 0 )
        {
            return 0;
        }
        else
        {
            int ans1 = ways(N - 1, ans + "1");
            int ans2 = ways(N - 3, ans + "3");
            int ans3 = ways(N - 5, ans + "5");

            return ans1 + ans2 + ans3;
        }
    }
}
