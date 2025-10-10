package Algorithms;

import java.util.Arrays;

public class insertion_sort_string 
{
     public static void main(String[] args) 
    {
        String a[] = { "Rohaz", "Mohan", "Sham", "Hitaishi" };

        System.out.println( "--Original Array --" );
        System.out.println( Arrays.toString(a) );

        insertionSort( a );

        System.out.println( "--Sorted Array --" );
        System.out.println( Arrays.toString(a) );
    }

    static void insertionSort( String a[] )
    {
        int L = a.length;
        String num;

        for( int i = 1; i <= L - 1; i++ ) // here i=1 bcz we are comparing with prev element
        {
            num = a[ i ];
            System.out.println( "Nums: " + num );

            int j = i - 1;
            while (j >= 0 && a[j].compareTo(num) > 0) {
            a[j + 1] = a[j];  // shift right
            j--;
        }
        a[j + 1] = num;  // place element at correct position

        System.out.println(Arrays.toString(a));
        }

    }
}
