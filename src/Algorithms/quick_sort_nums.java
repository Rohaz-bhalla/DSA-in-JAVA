package Algorithms;

import java.util.Arrays;

public class quick_sort_nums {

    public static void main(String[] args) {
        int a[] = {20, 49, 83, 12, 67, 23};
        int L = 0;
        int U = a.length - 1;

        System.out.println("Original Array => " + Arrays.toString(a));

        quickSort(a, L, U);

        System.out.println("Sorted Array   => " + Arrays.toString(a));
    }

    
    static void quickSort(int[] a, int L, int U) 
    {
        if (L < U) {

            // Partition the array and get the pivot's final position
            int pivotIndex = partition(a, L, U);

            // Recursively sort the elements before the pivot
            quickSort(a, L, pivotIndex - 1);
            
            // Recursively sort the elements after the pivot
            quickSort(a, pivotIndex + 1, U);
        }
    }

    static int partition(int[] a, int L, int U) {
        int i = L - 1;       // Index of the smaller element boundary
        int PIVOT = a[U];    // The pivot is the last element
        int t;               // Temporary variable for swapping

        for (int j = L; j < U; j++) {
            // If the current element is smaller than or equal to the pivot
            if (a[j] <= PIVOT) {
                i++; // Move the boundary for smaller elements

                // Swap a[i] and a[j]
                t = a[i];
                a[i] = a[j];
                a[j] = t;
            }
        }

        // Place the pivot in its correct final position
        // by swapping it with the element just after the "smaller" boundary
        t = a[i + 1];
        a[i + 1] = a[U];
        a[U] = t;

        // Return the pivot's new index
        return i + 1;
    }
}