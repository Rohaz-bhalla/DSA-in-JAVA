import java.util.*;

public class merge_2_sortedArrays 
{
    public static void main(String[] args) 
    {
      int a[] = { 1,2,3,4,5,6, };
      int b[] = { 7,8,9,10,11 };
      int c[] = merge(a,b);
      System.out.println(Arrays.toString(c));   
    }

    static int[] merge (int a[], int b[])
    {
        int m = a.length;
        int n = b.length;

        int c[] = new int [m+n];


        //copy the elements of first array in new array

        for(int i=0; i<=a.length-1; i++)
        {
            c[i] = a[i];
        }

        //copy the elements of 2nd array now

        for(int i=0; i<=b.length-1; i++)
        {
            c[i+m] = b[i];
        }

        return c;
    }
}