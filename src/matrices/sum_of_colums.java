package matrices;

import java.util.*;

public class sum_of_colums 
{
   public static void main(String[] args) 
   {
     int a [][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

     System.out.println(Arrays.toString(SumOfEachColumn(a)));
   } 

   static int[] SumOfEachColumn(int a[][])
   {
      int i,j,sum, M = a.length, N = a[0].length;

      int b[] = new int [N];

      for(i=0; i<=N-1; i++)
      {
         sum = 0;

         for(j=0; j<=M-1; j++ )
         {
            sum = sum + a[j][i];
         }
         b[i] = sum;
      }
      return b;
   }
}
