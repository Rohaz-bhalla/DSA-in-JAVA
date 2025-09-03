package Tree_Recursion;

public class generate_all_paranthesis 
{
    public static void main(String[] args) 
    {
        int n = 4;

        generate( n, n, "" );
    }

    static void generate( int open, int close, String ans )
    {
        if( open == 0 && close == 0 )
        {
            System.out.println( ans );
        }
        else 
        {
            if( open > 0 )
            {
                generate(open - 1, close, ans + "(");
            }
            if( close > 0 ) // here close > open to generate balanced
            {
                generate(open, close - 1, ans + ")");
            }
        }
    }
}
