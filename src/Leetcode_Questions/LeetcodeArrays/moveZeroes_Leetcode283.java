package LeetcodeArrays;

import java.util.*;

public class moveZeroes_Leetcode283 
{
    public static void main(String[] args) 
    {
        int a[] = { 0,1,0,3,12 };
        moveZeroes(a);
        System.out.println(Arrays.toString(a));
    }
    
    static void moveZeroes (int a [])
    {
        int j = 0;
         
        for(int i=0; i<=a.length-1; i++)
        {
            if(a[i] != 0)
            {
               a[j] = a[i];
               j++;
            }
        }
        while(j <= a.length-1)
        {
            a[j] = 0;
            j++;
        }
    }
}
