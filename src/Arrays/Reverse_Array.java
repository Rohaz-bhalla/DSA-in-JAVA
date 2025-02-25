// To reverse a given array

import java.util.*;

public class Reverse_Array 
{
    public static void main(String[] args) 
    {
         int a [] = { 1,2,3,4,5,6,7,8,9,10 };
         int b [] = (reverse(a));

         System.out.println(Arrays.toString(b));  // used To print the reversed Array
    }

    static int [] reverse (int a [])
    {
        int l = a.length;  // length of array
        for(int i=0; i<=(l/2)-1; i++)  // divide the length of array by 2 ((10/2)-1 = 4)
        {
            int t = a[i]; // index is temporarily stored in 't'
            a[i] = a[l-1-i]; // for swaping the elements
            a[l-1-i] = t; // the stored variable is replaced 
        }
        return a;
    }

}
