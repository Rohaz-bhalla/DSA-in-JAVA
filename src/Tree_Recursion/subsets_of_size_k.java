package Tree_Recursion;

import java.util.ArrayList;
import java.util.List;

public class subsets_of_size_k 
{
    public static void main(String[] args) 
    {
        String s = " ABC ";

        System.out.println( subsets( s, 2 ) );
    }

    static List<String> subsets( String s, int k )
    {
        List<String> main_list = new ArrayList<>();

        subsets( s, k, 0, "", main_list );

        return main_list;
    }

    static void subsets( String s, int k, int i, String ans, List<String> main_list )
    {
        if( i == s.length() )
        {
            System.out.println(ans);
            main_list.add(ans);
        }
        else
        {
            char ch = s.charAt(i);

            // include
            subsets(s, k, i + 1, ans + ch, main_list);

            //exclude
            subsets(s, k, i + 1, ans, main_list);
        }
    }
}
