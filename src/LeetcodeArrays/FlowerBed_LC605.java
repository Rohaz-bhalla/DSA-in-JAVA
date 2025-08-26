package LeetcodeArrays;

import java.util.*;

public class FlowerBed_LC605 
{
    public static void main(String[] args) 
    {
        int a [] = { 1,0,0,0,1 };
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Flowers To Be Planted : ");
        int n = sc.nextInt();
        sc.close();

        boolean b= FlowerBed( a,  n);

        System.out.println(b);
    }

    static boolean FlowerBed(int a[], int n)
    {

      if(n == 0) return true;

       int len = a.length;
       int count = 0;
       
      for(int i=0; i<len; i++)
      {
          if(a[i]==0)
          {
            int R,L;

            if(i==0)
            {
                L = 0;
            }
            else
            {
                L = a[i-1];
            }

            if(i == len-1)
            {
                R = 0;
            }
            else
            {
               R = a[i+1];
            }

            if(L==0 && R==0)
            {
                a[i] = 1;
                count ++;
                if(count>=n)
                {
                    return true;
                }
                i++;
            }
          }
      }

      return false;

    }
}
