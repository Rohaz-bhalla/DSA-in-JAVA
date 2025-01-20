package Arrays;

import java.util.*;

public class findDuplicates_leetcode442 
{
   public static void main(String[] args) 
   {
      int a [] = { 1,2,3,3,4,5,6,6,6,7,8,9 };
      System.out.println(findDupliactes(a)); 
   }  

   static ArrayList<Integer> findDupliactes(int a[])
   {
    ArrayList<Integer> al = new ArrayList<>();
    HashSet<Integer> hs = new HashSet<>();
      for(int p : a)
      {
        if(hs.add(p)==false)
        {
            al.add(p);
        }
      }
         return al;
   }
}
