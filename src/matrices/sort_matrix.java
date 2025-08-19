package matrices;
import java.util.*;

public class sort_matrix 
{
    public static void main(String[] args) 
    {
        int a[][] = {{ 12,2,4 },{ 6,8,1 },{ 11,7,3 },{ 5,9,10 }};

        System.out.println("--ORIGINAL MATRIX");
        printMatrix(a);

        sort(a);

        System.out.println("--SORTED--");
        printMatrix(a);

    }

    static void sort(int a[][])
    {
        int i,j,k,
        M = a.length,
        N = a[0].length;

        int b[] = new int[M*N];

        //copy from 2D to 1D
        k = 0;
        for(i=0; i<=M-1; i++)
        {
            for(j=0; j<=N-1; j++)
            {
                b[k] = a[i][j];
                k++;
            }
        }

        Arrays.sort(b);

        //copy back 1D to 2D
        k=0;
        for(i=0; i<=M-1; i++)
        {
            for(j=0; j<=N-1; j++)
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
