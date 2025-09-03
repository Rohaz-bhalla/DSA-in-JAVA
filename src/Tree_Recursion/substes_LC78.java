package Tree_Recursion;

import java.util.*;

public class substes_LC78 
{
    public static void main(String[] args) 
    {
        int arr [] = { 10,20,30 };

        String ans = "";
        System.out.println( backtrack(arr) );
    }

    static List <List<Integer>> backtrack( int[] arr )
    {
        List<List<Integer>> main_List = new ArrayList<>();

        subsets( arr, 0, "", main_List );
        return main_List;
    }

    static void subsets( int arr[], int i, String ans, List<List<Integer>> main_List )
    {
        if( i == arr.length )
        {
            List<Integer> ans_List = convertToList(ans); //convert string subset to list

            System.out.println( ans_List );

            main_List.add( ans_List ); // add to ans
        }
        else
        {
            int num = arr[i];

            //include current element
            subsets(arr, i + 1, ans + num + "", main_List);

            // exclude current element
            subsets(arr, i + 1, ans, main_List);
        }
    }

    static List<Integer>convertToList( String s )
    {
        s = s.trim();

        StringTokenizer st = new StringTokenizer(s); //break the string

        int n = st.countTokens(); // count the num of element

        if( n == 0 ) // empty
        {
            ArrayList<Integer> al = new ArrayList<>();
            return al;
        }
        else
        {
            ArrayList<Integer> al = new ArrayList<>();
            for( int i = 0; i <= n-1; i++ )
            {
                al.add( Integer.parseInt(st.nextToken()) ); // convert string to int by iterating
            }
            return al;
        }
    }
}

