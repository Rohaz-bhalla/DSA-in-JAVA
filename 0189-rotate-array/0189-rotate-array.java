class Solution {
    public void rotate(int[] nums, int k) 
    {
        k = k % nums.length;
      reverse( nums, 0, nums.length-1 ); // reverse full array
      reverse( nums, 0, k-1 ); // reverse upto the kth element
      reverse( nums, k, nums.length - 1 ); // reverse the other side of arr
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