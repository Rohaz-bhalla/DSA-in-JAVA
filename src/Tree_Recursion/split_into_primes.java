package Tree_Recursion;

import java.util.StringTokenizer;

public class split_into_primes 
{
    public static void main(String[] args) 
    {
        String s = "38237";

        split( s );

    }

    static void split( String s )
    {
        split( s, 0, "" );
    }

    static void split( String s, int i, String ans  )
    {
        if( i == s.length() - 1 )
        {
            //stop at last and append
            char ch = s.charAt(i);

            ans = ans + ch;

            //System.out.println(ans);

            if( allPrimes( ans ) )
            {
                System.out.println( ans );
            }
        }
        else
            {
                char ch = s.charAt(i);

                split(s, i + 1, ans + ch + " ");

                split(s, i + 1, ans + ch);
            }
    }

    static boolean allPrimes( String ans )
    {
        boolean over_ans = true;

        StringTokenizer st = new StringTokenizer(ans);
        int n = st.countTokens();

        for( int i = 1; i <= n; i++ )
        {
            String token = st.nextToken();

            int num = Integer.parseInt( token );

            over_ans = over_ans && isPrime( num );
        }
        return over_ans;
    }

    static boolean isPrime( int n )
    {
        if( n == 1 )
        {
            return false;
        }
        else
        {
            for( int i = 2; i <= Math.sqrt(n); i++ )
            {
                if( n % i == 0 )
                {
                    return false;
                }
            }
            return true;
        }
    }
}
