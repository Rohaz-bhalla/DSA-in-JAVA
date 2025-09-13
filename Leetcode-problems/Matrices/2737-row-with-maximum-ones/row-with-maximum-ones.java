class Solution {
    public int[] rowAndMaximumOnes(int[][] a) 
    {
        int i,j,
        M = a.length,
        N = a[0].length;

        int rowIndex = 0;
        int maxOnes = 0;

        for( i=0; i<=M-1; i++ )
        {
            int count = 0;

            for( j=0; j<=N-1; j++ )
            {
                if( a[i][j] == 1 )
                {
                    count++;
                }

                if( count > maxOnes )
                {
                    maxOnes = count;
                    rowIndex = i;
                }
            }
        }
            int b[] = { rowIndex, maxOnes};
            return b;
    }
}