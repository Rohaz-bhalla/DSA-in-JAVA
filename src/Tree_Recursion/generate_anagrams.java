package Tree_Recursion;

public class generate_anagrams 
{
    public static void main(String[] args) 
    {
        String s = "ROHAZ";

        anagram( s );
    }

    static void anagram( String s )
    {
        anagram( s, "" );
    }

    static void anagram( String s, String ans )
    {
        if( s.equals("") )
        {
            System.out.println( ans );
        }
        else
        {
            for( int i = 0; i <= s.length()-1; i++ )
            {
                char ch = s.charAt(i);

                String rem = s.substring(0, i) + s.substring(i+1);

                anagram( rem , ans + ch);
            }
        }
    }
}
