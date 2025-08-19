package ArraysDemo;

import java.util.*;

public class union_of_arrays 
{
   public static void main(String[] args) 
   {
    int a[] = { 1,2,3,4,5 };
    int b[] = { 4,5,6,7,8 };

    int c[] = unionArrays(a, b);
 
     System.out.println(Arrays.toString(c));

  
   }

   public static int[] unionArrays(int a[], int b[])
   {

       LinkedHashSet <Integer> lhs = new LinkedHashSet<>();

       for(int i=0; i<=a.length-1; i++)
       {
        lhs.add(a[i]);
       }

       for(int i=0; i<=b.length-1; i++)
       {
        lhs.add(b[i]);
       }
  
       int l = lhs.size();
       int c[] = new int[l];

       int i = 0;

       for(int p:lhs)
       {
        c[i] = p;
        i++;
       }

       
       return c;
    }
    

 }
