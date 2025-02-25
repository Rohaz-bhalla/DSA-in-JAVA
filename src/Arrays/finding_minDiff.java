import java.util.*;

public class finding_minDiff 
{
    public static void main(String[] args) 
    {
        
        int[] arr = {1,2,6,8,3,9};

     
        Arrays.sort(arr);

        
        int minDiff = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++)
        {
            int diff = arr[i] - arr[i - 1];
            minDiff = Math.min(minDiff, diff);
        }

        
        System.out.println("Sorted Array: " + Arrays.toString(arr));
        System.out.println("Minimum Difference: " + minDiff);
    }
}
