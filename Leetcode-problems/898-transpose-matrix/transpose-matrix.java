class Solution {
    public int[][] transpose(int[][] a) 
    {
        int i,j,
        M = a.length,
        N = a[0].length;
        int b[][] = new int[N][M];

        for( i=0; i<=M-1; i++ )
        {
            for( j=0; j<=N-1; j++ )
            {
                b[j][i] = a[i][j];
            }
        }
        return b;
    }
}