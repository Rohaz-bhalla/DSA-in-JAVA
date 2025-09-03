package Tree_Recursion;

public class counting_in_recursion 
{
    public static void main(String[] args) 
    {
        String s = " ABC ";

        int count[] = new int[1]; //can hold only 1 int, has only 1 slot
        count[0] = 0;

        // int count = {0} // shortcut of doing same

        subsets( s, 0, "", count );
    }

    static void subsets( String s, int i, String ans, int count[] )
    {
        count[0] ++;

        if( i == s.length() )
        {
            System.out.println( ans );
        }
        else
        {
            char ch = s.charAt(i);

            // include current element
            subsets(s, i + 1, ans + ch, count);

            //exclude current element
            subsets(s, i + 1, ans, count);
        }
    }
}
