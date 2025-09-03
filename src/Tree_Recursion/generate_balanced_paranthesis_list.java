package Tree_Recursion;

import java.util.ArrayList;
import java.util.List;

public class generate_balanced_paranthesis_list 
{
    public static void main(String[] args) 
    {
        int n = 4;

        System.out.println( generateList( n ) );
    }

    static List<String>generateList( int n )
    {
        List<String> al = new ArrayList<>();

        generate(n, n, "", al);
        return al;
    }

    static void generate( int open, int close, String ans, List<String> al )
    {
        if( open == 0 && close == 0 )
        {
            //System.out.println( ans );
            al.add(ans);
        }
        else
        {
            if( open > 0 )
            {
                generate(open - 1, close, ans + "(", al);
            }
            if( close > 0 && close > open )
            {
                generate(open, close - 1, ans + ")", al);
            }
        }
    }
}
