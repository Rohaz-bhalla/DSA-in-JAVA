package Tree_Recursion;

import java.util.Arrays;
import java.util.StringTokenizer;

public class find_max_prod_number_partition 
{
    public static void main(String[] args) 
    {
        int N = 8;

        System.out.println( maxProduct( N ) );
    }

    static int maxProduct( int N )
    {
        int max[] = {0};

        maxProduct(N, "", max);

        return max[0];
    }

    static void maxProduct( int N, String ans, int max[] )
    {

        if( N == 0 )
    {

        int b[] = convertToArrays( ans );

        int prod = 1;

        for( int val : b ) prod *= val;

        System.out.println( ans + "-->"+ Arrays.toString(b)+ "-->" + prod );

        if(prod > max[0] )
        {
            max[0] = prod;
        }
    }
        else
        {
            for( int i = 1; i<=N; i++ )
            {
                maxProduct(N - i, ans + i + "", max);
            }
        }
    }

    static int[] convertToArrays( String ans )
    {
        StringTokenizer st = new StringTokenizer(ans);
        int token = st.countTokens();

        if( token == 0 )
        {
            int b[] = new int[0];
            return b;
        }
        else
        {
            int b[] = new int[ token ];

            for( int i = 0; i<= token - 1; i++ )
            {
                b[i] = Integer.parseInt( st.nextToken() );
            }
            return b;
        }
    }
}
