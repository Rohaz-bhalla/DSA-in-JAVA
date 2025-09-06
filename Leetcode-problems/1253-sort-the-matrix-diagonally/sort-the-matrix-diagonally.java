class Solution {
    public int[][] diagonalSort(int[][] a) 
    {
        int i,j,
        M = a.length,
        N = a[0].length;

        Map<Integer, PriorityQueue<Integer>> pq = new HashMap<>();
        
        for( i=0; i<=M-1; i++ )
        {
            for( j=0; j<=N-1; j++ )
            {
                pq.putIfAbsent( i-j, new PriorityQueue<>() );  // i-j means diagnols = 0
                pq.get( i-j ).add(a[i][j]); // i-j se jo diagnols mile unko matrix main daal do
            }
        }

        for( i=0; i<=M-1; i++ )
        {
            for( j=0; j<=N-1; j++ )
            {
                a[i][j] = pq.get( i-j ).poll();
            }
        }
        return a;
    }
}