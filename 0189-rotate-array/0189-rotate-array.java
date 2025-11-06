class Solution {
    public void rotate(int[] nums, int k) 
    {
        k = k % nums.length; // if arr > k, we wont repeat same steps(optimize)
      reverse( nums, 0, nums.length-1 ); // reverse full array
      reverse( nums, 0, k-1 ); // reverse upto the first k elements
      reverse( nums, k, nums.length - 1 ); // reverse remaining elements
    }

    public void reverse( int arr[], int i, int j )
    {
        while( i < j )
        {
            int swap = arr[i];
            arr[i] = arr[j];
            arr[j] = swap;
            i++;
            j--;
        }
    }
}