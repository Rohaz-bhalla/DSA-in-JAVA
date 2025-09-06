class Solution {
    public int climbStairs(int n) 
    {
        int memo[] = new int [ n + 1 ];
        return climb( n, memo );
    }

    static int climb( int n, int[] memo )
    {
        if( n == 0 )
        {
            return 1;
        }
        else if( n < 0 ) 
        {
            return 0;
        }

        if( memo[n] != 0 ) return memo[n];

        else
        {
            int count = 0;
            for( int i = 1; i <= 2; i++ )
            {
              count += climb( n - i, memo );
            }

        memo[n] = count;
         return count;
        }   
    }
}