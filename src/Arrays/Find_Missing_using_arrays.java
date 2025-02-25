//To find multiple missing numbers using list 

import java.util.*;

public class Find_Missing_using_arrays 
{
  public static void main(String[] args) {
    int a [] = { 3,2,5,8,10,6 };

    System.out.println(multipleMissingNumbers_second_method(a,10));
  }  
  static List<Integer> multipleMissingNumbers_second_method(int a[], int N)
  {
     int freq[]= new int[N+1];
  

      // pick elements and set 1 in corresponding freq array
      for(int i=0; i<=a.length-1; i++)
      {
         int num = a[i];
  
         if(num >= 1 && num <= N)
         freq [num] = 1;
         else
         {
           System.out.println("Invalid Number :"+num);
         }
        }
       

        //Copy elements and put thrm in array
        ArrayList <Integer> al = new ArrayList<>();

        
        // Now check which elements have 0 missing 
        for(int i=1; i<=freq.length-1; i++)
        {
        if(freq[i] == 0)
        System.out.println("The missing number is : "+i);
        al.add(i);
        }
        return al;
    }
}
