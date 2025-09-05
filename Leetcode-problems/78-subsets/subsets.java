class Solution {
    public List<List<Integer>> subsets(int[] nums) 
    {
        List<List<Integer>> res = new ArrayList<>();
        backtrack( nums, 0, new ArrayList<>(), res );
        return res;
    }

    static void backtrack( int[] nums, int i, List<Integer> ans, List<List<Integer>>res )
    {
        if( i == nums.length )
        {
            res.add( new ArrayList<>( ans ) );
            return;
        }

        ans.add( nums[i] );

        backtrack( nums, i + 1, ans, res );
        ans.remove( ans.size() - 1 );

        backtrack( nums, i + 1, ans, res );
    }
}