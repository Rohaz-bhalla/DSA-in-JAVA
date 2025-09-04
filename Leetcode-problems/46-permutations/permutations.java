class Solution {
    public List<List<Integer>> permute(int[] nums) 
    {
        List<List<Integer>> res = new ArrayList<>();
        ways( nums, new ArrayList<>(), res );
        return res;
    }

    static void ways( int[] nums, List<Integer>ansList, List<List<Integer>>res )
    {
        if( ansList.size() == nums.length )
        {
            res.add( new ArrayList<>(ansList) );
        }

        for( int p : nums )
        {
            if( ansList.contains( p ) ) continue;

            ansList.add( p ); // add new element

            ways( nums, ansList, res );

            ansList.remove( ansList.size() - 1 );
        }
    } 
}