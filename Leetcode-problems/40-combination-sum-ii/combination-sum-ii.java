class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) 
    {
        List<List<Integer>> main_list = new ArrayList<>();

        Arrays.sort( candidates );
        ways( candidates, target, 0, new ArrayList<>(), 0, main_list );
        return main_list;
    }

    static void ways ( int[] candidates, int target, int i, List<Integer>ans, int sum, List<List<Integer>> main_list )
    {
        if( sum == target )
        {
            main_list.add( new ArrayList<>( ans ) );
            return;
        }

        if( sum > target || i == candidates.length ) return;

        for( int j = i; j <= candidates.length - 1; j++ )
        {
            if( j > i && candidates[j] == candidates[ j - 1 ] ) continue;

            ans.add( candidates[j] );

            ways( candidates, target, j + 1, ans, sum + candidates[j], main_list );
            ans.remove( ans.size() - 1 );// bactrack.. removes old and add new element 
        }
    }
}