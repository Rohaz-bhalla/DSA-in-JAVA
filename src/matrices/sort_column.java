package matrices;

import java.util.Arrays;

public class sort_column 
{
    public static void main(String[] args) 
    {
        int a[][] = {{ 12,2,4 },{ 6,8,1 },{ 11,7,3 },{ 5,9,10 }};

        System.out.println("--ORIGINAL MATRIX");
        printMatrix(a);

        sortColumns(a);

        System.out.println("--SORTED--");
        printMatrix(a);
    }

    static void sortColumns (int a[][])
    {
        
        int i,j,
        M = a.length,
        N = a[0].length;
        //int len = Math.min(M, N);
        int b[] = new int[M]; 

        for(j=0; j<=N-1; j++)
        {
            for(i=0; i<=M-1; i++)
            {
                b[i] = a[i][j];
            }
            Arrays.sort(b);

        for(i=0; i<=M-1; i++)
    {
        a[i][j] = b[i];
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
