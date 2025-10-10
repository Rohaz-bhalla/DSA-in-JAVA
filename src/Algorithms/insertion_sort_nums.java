package Algorithms;

import java.util.Arrays;

public class insertion_sort_nums 
{
    public static void main(String[] args) 
    {
        int a[] = { 9,8,7,6,5,5,4,3,2,1 };

        System.out.println( "--Original Array --" );
        System.out.println( Arrays.toString(a) );

        insertionSort( a );

        System.out.println( "--Sorted Array --" );
        System.out.println( Arrays.toString(a) );
    }

    static void insertionSort( int a[] )
    {
        int L = a.length;
        int num;

        for( int i = 1; i <= L - 1; i++ ) // here i=1 bcz we are comparing with prev element
        {
            num = a[ i ];
            System.out.println( "Nums: " + num );

            int j = i - 1;
            while (j >= 0 && a[j] > num) {
            a[j + 1] = a[j];  // shift right
            j--;
        }
        a[j + 1] = num;  // place element at correct position

        System.out.println(Arrays.toString(a));
        }

    }
}
