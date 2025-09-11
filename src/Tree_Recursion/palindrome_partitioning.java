package Tree_Recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class palindrome_partitioning 
{
    public static void main(String[] args) 
    {
        String s = "ROHAZ";

        System.out.println( partition(s) );
    }

    static List<List<String>> partition( String s )
    {
        List<List<String>> main_list = new ArrayList<>();

        cut( s, 0, "", main_list );
        return main_list;
    }

    static void cut( String s, int i, String ans, List<List<String>> main_list )
    {
        if( i == s.length() - 1 )
        {
            char ch = s.charAt(i);
            ans = ans + ch;

            if( allPalindromes( ans ) )
            {
                List<String> ans_list = convertToList( ans );
                main_list.add(ans_list);
            }
        }
        else
        {
            char ch = s.charAt(i);

            cut(s, i + 1, ans + ch + " ", main_list);

            cut(s, i + 1, ans + ch , main_list);
        }
    }

    static List<String> convertToList( String ans )
    {
        List<String> al = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(ans);
        int n = st.countTokens();

        for( int  i = 1; i <= n; i++ )
        {
            String token = st.nextToken();
            al.add(token);
        }
        return al;
    } 

    static boolean allPalindromes( String ans )
    {
        StringTokenizer st = new StringTokenizer(ans);
        int n = st.countTokens();

        boolean over_ans = true;

        for( int i = 1; i <= n; i++ )
        {
            String token = st.nextToken();

            over_ans = over_ans && ispalindrome( token );
        }
        return over_ans;
    }

    static boolean ispalindrome( String s )
    {
        StringBuffer sb = new StringBuffer(s);

        sb.reverse();

        if( s.equals(sb.toString()) )
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
