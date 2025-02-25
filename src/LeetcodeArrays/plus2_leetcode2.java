package LeetcodeArrays;

import java.util.*;

public class plus2_leetcode2 
{
    public static void main(String[] args) 
    {
        int a[] = { 1,2,4,5 };
        int target = 6;
       
        int b[] = plusTwo(a, target);

        System.out.println(Arrays.toString(b));
    }

    static int[] plusTwo (int a[], int target)
    {
        for (int i=0; i<= a.length-1; i++)
        {
            for(int j=i+1; j<=a.length-2;j++)
            {
                if(a[i] + a[j] == target)
                {
                  return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
