class Solution {
    public int findTheWinner(int n, int k) 
    {
        if( n == 1 )
        {
            return 1;
        }
        else
        {
            ArrayList<Integer> res = new ArrayList<>();
            for( int i = 1; i <= n; i++ )
            {
                res.add( i );
            }

            int i = -1;

            while( true )
            {
                i = ( i + k ) % res.size();

                res.remove( i );

                i = i - 1;

                if( res.size() == 1 )
                {
                    break;
                }
            }
        return res.get( 0 );
        }
    }
}