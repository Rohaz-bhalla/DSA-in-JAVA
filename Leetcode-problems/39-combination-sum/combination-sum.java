class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
        List<List<Integer>> res = new ArrayList<>();

        ways( candidates, 0, target, new ArrayList<>(), 0, res );
        return res;
    }

    static void ways( int[] a, int i, int target, List<Integer>ansList, int sum, List<List<Integer>> res )
    {
        if( sum == target )
        {
            res.add( new ArrayList<>( ansList ) );
            return;
        }

        if( i == a.length || sum > target )
        {
            return;
        }

        ansList.add( a[i] );

        //include 
        ways( a, i , target, ansList, sum + a[i], res ); 
        // no i+1 here bcz we can use duplicates to get target val

        ansList.remove( ansList.size() - 1 ); // backtrack

        //exclude
        ways( a, i + 1, target, ansList, sum, res );
    }
}