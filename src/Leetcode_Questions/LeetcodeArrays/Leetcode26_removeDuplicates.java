package LeetcodeArrays;

import java.util.*;

public class Leetcode26_removeDuplicates 
{
    public static void main(String[] args) 
    {
        int a[] = { 1,2,3,4,5,6,7,7,7,8,9 };

        System.out.println(removeDuplicates(a));

    }
    
    static int removeDuplicates(int a[])
    {
        
        Arrays.sort(a);
        if(a.length==0)
        {
            return 0;
        }
        int  j=0;
        for (int i=1; i<a.length; i++)
        {
           if(a[i]!=a[j])
           {
           j++;
           a[j] = a[i];
           }
        }

        return j+1;
        

    }
}
