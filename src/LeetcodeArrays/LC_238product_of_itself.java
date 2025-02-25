package LeetcodeArrays;

import java.util.*;

public class LC_238product_of_itself 
{
   public static void main(String[] args) 
   {
    int a[] = {1,2,3,4};
    int result [] = product(a);

    System.out.println(Arrays.toString(result));
   } 

   static int[] product(int a[])
   {
    int n = a.length;
    int b[] = new int[n];
    for(int i=0; i<n; i++)
    {
        b[i] = 1;     

        for(int j=0; j<n; j++)
        {
         if(i != j)
         {
            b[i] *= a[j];
         }   
        }
    }

    return b;
       
   }
}
