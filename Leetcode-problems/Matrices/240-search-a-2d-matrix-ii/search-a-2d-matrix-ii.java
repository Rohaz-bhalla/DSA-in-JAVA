class Solution {
    public boolean searchMatrix(int[][] a, int target) 
    {
        int i,j,
        M = a.length,
        N = a[0].length;

        for( i=0; i<=M-1; i++ )
        {
            for( j=0; j<=N-1; j++ )
            {
                if( a[i][j] == target )
                {
                    return true;
                }
            }
        }
        return false;
    }
}