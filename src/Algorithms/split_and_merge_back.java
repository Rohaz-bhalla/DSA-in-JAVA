package Algorithms;

import java.util.Arrays;

public class split_and_merge_back 
{
    public static void main(String[] args) 
    {
        int a[] = { 3,1,5,4 };

        System.out.println( " --Original Array-- " );
        System.out.println( Arrays.toString( a ) );

        splitAndMergeBack( a, 0, 3 );

        System.out.println( "--Updated Arrays--" );
        System.out.println( Arrays.toString( a ) );
    }

    static void splitAndMergeBack( int a[], int L, int U )
    {
        int mid = ( L + U )/2;

        int t1[] = new int[ mid - L + 1 ];
        int t2[] = new int[ U - mid ];

        for( int i = 0; i <= t1.length - 1; i++ )
        {
            t1[ i ] = a[ i + L ];
        }

        for( int j = 0; j <= t2.length - 1; j++ )
        {
            t2[ j ] = a[ j + ( mid + 1 ) ];
        }

        System.out.println( Arrays.toString( t1 ) );
        System.out.println( Arrays.toString( t2 ) );

        int m = t1.length;
        int n = t2.length;

        int i = 0, j = 0, k = L;

        //s merge with bound checks
        while( i < m && j < n ) 
        {
            if( t1[ i ] < t2[ j ] )
            {
                a[ k ] = t1[ i ];
                i++;
                k++;
            }
            else
            {
                a[ k ] = t2[ j ];
                j++;
                k++;
            }
        }

        // copy leftovers
        while( i < m )
        {
            a[ k ] = t1[ i ];
            i++;
            k++;
        }
        while( j < n )
        {
            a[ k ] = t2[ j ];
            j++;
            k++;
        }
    }
}
