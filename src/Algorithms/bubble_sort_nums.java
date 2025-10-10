package Algorithms;

import java.util.Arrays;

public class bubble_sort_nums 
{
    public static void main(String[] args) 
    {
        int a[] = { 9,8,7,6,5,5,4,3,2,1 };

        System.out.println( "--Original Array --" );
        System.out.println( Arrays.toString(a) );

        bubbleSort( a );

        System.out.println( "--Sorted Array --" );
        System.out.println( Arrays.toString(a) );

    }

    static void bubbleSort( int a[] )
    {
        int i, j, temp;
        boolean swapped;
        int N = a.length;

        for( i = 0; i <= N-2; i++ ) // N-2 bcz last element will be sorted
        {
            swapped = false;

            for( j = 0; j <= N-2-i; j++ )// N-2-i bcz i keep check of sorted array and sub it
            {
                if( a[ j ] > a[ j + 1 ] )// for desc order just use '<' instead of '>' 
                {
                    temp = a[ j ];
                    a[ j ] = a[ j + 1 ];
                    a[ j + 1 ] = temp;

                    swapped = true;
                }
            }
            if( !swapped ) break;

            System.out.println( "After " + i + " Pass" );
            System.out.println(Arrays.toString(a));
        }
    }
}
