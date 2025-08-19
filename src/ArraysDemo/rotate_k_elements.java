package ArraysDemo;

import java.util.*;

public class rotate_k_elements 
{
    public static void main(String[] args) 
    {
        int a[] = { 1,2,3,4,5,5,6,7,8,9 };
        int K = 3;
        int N = a.length;

        int c[] = rotate(a,K,N);
        System.out.println(Arrays.toString(c));

    }
     
    static int[] rotate(int a[], int K, int N )
    {

        // creating a temp array to store last k elements
        int b[] = new int [K];
        for(int i=0; i<=K-1; i++)
        {
            b[i] = a[i+(N-K)];
        }
          
        // shift the k-elements
        for(int i = N-K-1; i>=0; i--)
        {
            a[i+K] = a[i];  //index with which it has to be swapped
        }

        //inserting last k elements at the start
        for(int i=0; i<=K-1; i++)
        {
            a[i] = b[i];
        }
        return a;
    }

}
