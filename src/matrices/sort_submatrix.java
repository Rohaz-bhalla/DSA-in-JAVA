package matrices;

import java.util.Arrays;

public class sort_submatrix 
{
    public static void main(String[] args) 
    {
    int a[][] = { {5,5,5,5,5,5}, {4,4,4,4,4,4}, {3,3,3,3,3,3}, {2,2,2,2,2,2}, {1,1,1,1,1,1} };
    
    System.out.println("-- Original --");
    printMatrix(a);
    
    sortSubmatrix(a);
    
    System.out.println("-- After Sorting --");
    printMatrix(a);
    }

    static void sortSubmatrix(int a[][])
    {
        
        int i,j,k,
        M = a.length,
        N = a[0].length;
        int b[] = new int[(M-2)*(N-2)]; // (M-2)*(N-2) = (5-2)*(6-2) = 3*4 = 12 ... Determines the size of inner matrix

        k = 0;
        for(i=1; i<=M-2; i++)
        {
            for(j=1; j<=N-2; j++)
            {
                b[k] = a[i][j];
                k++;
            }
        }

        Arrays.sort(b);

        k = 0;
        for(i=1; i<=M-2; i++)
        {
            for(j=1; j<=N-2; j++)
            {
                a[i][j] = b[k];
                k++;
            }
        }
    }

        static void printMatrix(int a[][]) {
        System.out.println("The matrix is");
        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = 0; j <= a[i].length - 1; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
