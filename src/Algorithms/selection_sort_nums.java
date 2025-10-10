package Algorithms;

import java.util.Arrays;

public class selection_sort_nums 
{
    public static void main(String[] args) {
        int a[] = {20, 49, 83, 12, 67, 23};

        System.out.println("Original Array => " + Arrays.toString(a));

        selectionSort( a );

        System.out.println("Sorted Array   => " + Arrays.toString(a));
    }

    static void selectionSort ( int a[] )
    {
        int N = a.length;

        for( int i = 0; i < N-2; i++ )
        {
            int small = a[i];
            int pos = i;

            for( int j = i + 1; j <= N - 1; j++ )
            {
                if( a[j] < small )
                {
                    small = a[j];
                    pos = j;
                }
            }

            int t = a[i]; 
            a[i] = a[pos];
            a[pos] = t;
        }
    }
} 
