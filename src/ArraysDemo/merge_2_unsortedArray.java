package ArraysDemo;

import java.util.*;

public class merge_2_unsortedArray 
{
    public static void main(String[] args) 
    {
        int a[] = { 1,2,7,5,8,3 };
        int b[] = {9,6,3,10};

        int c[] = mergeUnsorted(a,b);

        System.out.println(Arrays.toString(c));
    }

    static int[] mergeUnsorted(int a[], int b[])
    {
        
        int m = a.length;
        int n = b.length;

        int c [] = new int [m+n];

        for(int i=0; i<=a.length-1;i++)
        {
            c[i] = a[i];
        }

        for(int i=0; i<=b.length-1;i++)
        {
            c[i+m] = b[i];
        }

        Arrays.sort(c);
       return c;
    }
}
