class Solution {
    public List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> ans = new ArrayList<>();
        int i,j;

        for( i=0; i<=numRows-1; i++ )
        {
            List<Integer> rows = new ArrayList<>();
            
            for( j=0; j<=i; j++ )
            {
                if( j == 0 || j == i )
                {
                    rows.add(1);
                }else
                {
                    rows.add(ans.get(i-1).get(j-1) + ans.get(i-1).get(j) );
                }
            }
            ans.add(rows);
        }
        return ans;
    }
}