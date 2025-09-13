class Solution {
    public int countNegatives(int[][] a) 
    {
        int i,j,
        M = a.length,
        N = a[0].length;
        
        int count = 0;

        for( i=0; i<=M-1; i++ )
        {
            for( j=0; j<=N-1; j++ )
            {
                if( a[i][j] < 0 )
                {
                    count++;
                }
            }
        }
        return count;
    }
}