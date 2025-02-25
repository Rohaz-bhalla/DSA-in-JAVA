package LeetcodeArrays;

import java.util.*;

public class LC_1480_runningSumOf_1D_Array 
{
    public static void main(String[] args) 
    {
        int a[] = { 1,2,3,4 };

        System.out.println(Arrays.toString(runningSum(a)));
    }

    static int[] runningSum(int a[])
    {
        int sum = 0;
        int n = a.length;
        for(int i=0; i<n; i++)
        {
          for(int j=i+1; j<n; j++)
          {
            sum = i + j;
            i++;
            j++;
          }
        }
        
        int[] arr = new int [n+1];
         arr[0] = sum;
         return arr;
    }
}
