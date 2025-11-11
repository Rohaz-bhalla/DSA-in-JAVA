class Solution {
    public int findDuplicate(int[] nums) 
    {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for( int i = 0; i <= nums.length - 1; i++ )
        {
            if( hm.containsKey(nums[i]) )
            {
                return nums[i];
            }
            else
            {
                hm.put(nums[i], 1); // 1 here means we have seen that val once
            }
        }
        return -1; // in-case no duplicates are there
    }
}