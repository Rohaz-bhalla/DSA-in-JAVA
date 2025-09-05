class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) 
    {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort( nums );

        boolean[] used = new boolean[ nums.length ];
        ways( nums, used, new ArrayList<>(), res );
        return res;
    } 

    static void ways( int[] nums, boolean[] used, List<Integer> ansList, List<List<Integer>>res )
    {
        if( ansList.size() == nums.length )
        {
            res.add( new ArrayList<>( ansList ) );
            return;
        }

        for( int i = 0; i <= nums.length - 1; i++ )
        {
            if( used[i] ) continue;

            //skip picking same no. twice so same set dubara na bne

            if( i > 0 && nums[i] == nums[ i - 1 ] && !used[ i - 1 ] )
            {
                continue;
            }

            used[ i ] = true;

            ansList.add( nums[ i ] );

            ways( nums, used, ansList, res );

            ansList.remove( ansList.size() - 1 );
            used[ i ] = false; 
        }
    }
}