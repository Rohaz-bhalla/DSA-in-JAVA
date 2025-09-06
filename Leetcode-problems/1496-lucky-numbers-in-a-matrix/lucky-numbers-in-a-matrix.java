class Solution {
    public List<Integer> luckyNumbers(int[][] a) 
    {
        int i, j,
        M = a.length,
        N = a[0].length;

        HashSet<Integer> minRows = new HashSet<>();
        HashSet<Integer> maxCols = new HashSet<>();

        // find min element in each row
        for( i=0; i<=M-1; i++ )
        {
            int minVal = a[i][0];
            for( j=0; j<=N-1; j++ )
            {
                minVal = Math.min(minVal, a[i][j]);
            }
            minRows.add(minVal);
        }

        // find max element in each column
        for( j=0; j<=N-1; j++ )
        {
            int maxVal = a[0][j];
            for( i=0; i<=M-1; i++ )
            {
                maxVal = Math.max(maxVal, a[i][j]);
            }
            maxCols.add(maxVal);
        }

        // intersection of row-min and col-max
        List<Integer> result = new ArrayList<>();
        for( int val : minRows )
        {
            if( maxCols.contains(val) )
            {
                result.add(val);
            }
        }
        return result;
    }
}
