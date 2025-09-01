package Recursion.Tail;

public class reverse_string_tail 
{
    public static void main(String[] args) 
    {
        String s = " ROHAZ ";
        reverse( s, s.length()-1, "" );
    }

    static void reverse( String s, int i, String ans )
    {
        if( i == -1 )
        {
            System.out.println( ans );
        }
        else
        {
            char ch = s.charAt(i);
            ans = ans + ch;
            reverse(s, i - 1, ans);
        }
    }
}
