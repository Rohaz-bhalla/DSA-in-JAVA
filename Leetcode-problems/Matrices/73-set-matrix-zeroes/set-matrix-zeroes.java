class Solution {
    public void setZeroes(int[][] a) 
    {
        int i,j,
        M = a.length,
        N = a[0].length;

        boolean[] rows = new boolean[M];
        boolean[] cols = new boolean[N];

        for( i=0; i<=M-1; i++ )
        {
            for( j=0; j<=N-1; j++ )
            {
                if( a[i][j] == 0)
                {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        for( i=0; i<=M-1; i++ )
        {
            for( j=0; j<=N-1; j++ )
            {
               if( rows[i] == true || cols[j] == true )
               {
                a[i][j] = 0;
               }
            }

        }
    }
}