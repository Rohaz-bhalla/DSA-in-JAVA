class Solution {
    public void rotate(int[][] a) 
    {
        int i,j,
        M = a.length,
        N = a[0].length;

        int b[][] = transpose(a);
        int c[][] = mirror(b);

        for( i=0; i<=M-1; i++ )
        {
            for( j=0; j<=N-1; j++ )
            {
                a[i][j] = c[i][j];
            }
        }
    }

    static int [][] transpose(int a[][])
    {
        int i,j,
        M = a.length,
        N = a[0].length;

        int b[][] = new int [M][N];

        for( i=0; i<=M-1; i++ )
        {
            for( j=0; j<=N-1; j++ )
            {
               b[j][i] = a[i][j]; 
            }
        }
        return b;
    }

    static int[][] mirror(int a[][])
    {
        int i,j,
        M = a.length,
        N = a[0].length;

        int b[][] = new int [M][N];

        for( i=0; i<=M-1; i++ )
        {
            for( j=0; j<=N-1; j++ )
            {
                b[i][N - 1 - j] = a[i][j];
            }
        }
        return b;
    }
}