package Algorithms;

import java.util.Arrays;

public class selection_sort_string 
{
       public static void main(String[] args) {
        String a[] = {"Rohaz", "Hitaishi", "Ram", "Sham"};

        System.out.println("Original Array => " + Arrays.toString(a));

        selectionSort( a );

        System.out.println("Sorted Array   => " + Arrays.toString(a));
    }

    static void selectionSort ( String a[] )
    {
        int N = a.length;

        for( int i = 0; i < N-2; i++ )
        {
            String small = a[i];
            int pos = i;

            for( int j = i + 1; j <= N - 1; j++ )
            {
                if( a[j].compareTo( small ) < 0 )
                { 
                    small = a[j];
                    pos = j;
                }
            }

            String t = a[i]; 
            a[i] = a[pos];
            a[pos] = t;
        }
    }
}
