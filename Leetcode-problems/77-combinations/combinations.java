class Solution {
    public List<List<Integer>> combine(int n, int k) 
    {
        List<List<Integer>> res = new ArrayList<>();

        backtrack( n, k, 1, new ArrayList<>(), res );
        return res;
    }

    static void backtrack( int n, int k, int i, List<Integer>ans, List<List<Integer>>res )
    {
        if( ans.size() == k )
        {
            res.add( new ArrayList<>( ans ) );
            return;
        }
        else
        {
           for( int j = i; j <= n; j++ ) // limits 1 -> n
           {
            ans.add( j );
            backtrack( n, k, j  + 1, ans, res );
            ans.remove( ans.size() - 1 );
           }
        }
    }
}