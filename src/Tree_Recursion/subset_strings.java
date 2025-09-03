package Tree_Recursion;

public class subset_strings 
{
    public static void main(String[] args) 
    {
        String s = " ABC ";

        subsets( s,0,"" );
    }

    static void subsets( String s, int i, String ans )
    {
        if( i == s.length() )
        {
            System.out.println(ans);
        }
        else
        {
            char ch = s.charAt(i);

            // include branch // takes a char and include it
            subsets(s, i + 1, ans + ch);

            //exclude branch // takes same char and exclude that
            subsets(s, i + 1, ans);
        }
    }
}
