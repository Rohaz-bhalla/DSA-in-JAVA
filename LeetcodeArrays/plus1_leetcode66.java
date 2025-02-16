package LeetcodeArrays;

import java.util.*;

public class plus1_leetcode66 
{
 public static void main(String[] args) 
   {
      int a[] = { 1,2,3,4 };
      System.out.println(Arrays.toString(plusOne(a)));
   }   

   static int[] plusOne(int a[])
   {
       int n=a.length;

    for(int i = n - 1; i >= 0; i--)
      {
        if(a[i]<9)
        {
          a[i]++;
          return a;
        }
        a[i]=0;
        
      }


     int[] newNumber = new int[n + 1];
             newNumber[0] = 1;
             return newNumber;
   }

}
