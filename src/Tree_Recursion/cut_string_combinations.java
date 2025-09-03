package Tree_Recursion;

public class cut_string_combinations 
{
    public static void main(String[] args) 
    {
        String s = " ABCD ";

        ways( s );
    }

    static void ways( String s )
    {
        ways( s, 0, "" );
    }

    static void ways( String s, int i, String ans )
    {
        if( i == s.length() -1 ) // stop 1 b4 and add char at end
        {
            ans = ans + s.charAt(i);
            System.out.println(ans);
        }
        else
        {
            //pick a char
            char ch = s.charAt(i);

            ways(s, i + 1, ans + ch + ".");

            ways(s, i + 1, ans);
        }
    }
}
