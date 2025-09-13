class Solution {
    public int[][] flipAndInvertImage(int[][] a) 
    {
        int i,j,
        M = a.length,
        N = a[0].length;

        int b[][] = new int [M][N];

        for(i=0; i<=M-1; i++)
        {
            for(j=0; j<=N-1; j++)
            {
                b[i][N-1-j] = a[i][j]^1;            }
        }
        return b;
    }
}