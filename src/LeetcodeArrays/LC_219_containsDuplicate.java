package LeetcodeArrays;

import java.util.*;

public class LC_219_containsDuplicate 
{
    public static void main(String[] args) 
    {
        int a[] = { 1,2,3,1 };
        int k = 3;

        System.out.println(containsDuplicate(a,k));
    }

    static Boolean containsDuplicate(int a[], int k)
    {
       HashSet <Integer> hs = new HashSet<>();

       for(int i=0; i<a.length; i++)
       {
         if(hs.contains(a[i]))
         {
           return true;
         }
         hs.add(a[i]);

         if(hs.size()>k)
         {
            hs.remove(a[i-k]);
         }
       }
         return false;
    }
}
