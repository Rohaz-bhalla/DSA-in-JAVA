class Solution {
    public int islandPerimeter(int[][] a) 
    {
        int i,j,
        M = a.length,
        N = a[0].length;

        int count = 0;

        for( i=0; i<=M-1; i++ )
        {
            for( j=0; j<=N-1; j++ )
            {
                if( a[i][j] == 0 ) continue;
                if( i == 0 || a[i-1][j] == 0 ) count++;  //top
                if( i == M-1 || a[i+1][j] == 0) count++; //bottom
                if( j==0 || a[i][j-1] == 0 ) count++;    //left
                if( j==N-1 || a[i][j+1] ==0 ) count++;   //right
            }
        }
            return count;
    }
}