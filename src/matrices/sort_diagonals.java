package matrices;

import java.util.Arrays;

public class sort_diagonals 
{
    public static void main(String[] args) 
    {
        int a[][] = {{ 3,3,1,1 },{ 2,2,1,1 },{ 1,1,1,2 }};

        System.out.println("--ORIGINAL MATRIX");
        printMatrix(a);

        sortDiagonals(a);

        System.out.println("--SORTED--");
        printMatrix(a);
    }

    static void sortDiagonals(int a[][])
    {
        int i,
        M = a.length,
        N = a[0].length;
        int len = Math.min(M, N); //stores the size of main diagonal

        int b[] = new int[len];

        for(i=0; i<=len-1; i++)
        {
            b[i] = a[i][i];
        }

        Arrays.sort(b);

        for(i=0; i<=len-1; i++)
        {
            a[i][i] = b[i];
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
