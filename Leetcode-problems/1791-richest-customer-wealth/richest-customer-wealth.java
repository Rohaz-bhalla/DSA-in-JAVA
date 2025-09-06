class Solution {
    public int maximumWealth(int[][] a) 
    {
        int i,j,
        M = a.length,
        N = a[0].length;

        int maxVal = 0; //store krega max value

        for( i=0; i<=M-1; i++ )
        {
            int resetVal = 0; // reset krega val bcz if not reseted the prev val will be added with next one....
            for( j=0; j<=N-1; j++ )
            {
                resetVal += a[i][j];
            }
            maxVal = Math.max(maxVal, resetVal); // compare krega maxVal and resetVal konsa bdha h
        }
        return maxVal;
    }
}