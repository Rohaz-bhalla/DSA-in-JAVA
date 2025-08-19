package matrices;

import java.util.Arrays;

public class sort_each_row 
{
    public static void main(String[] args) 
    {
        int a[][] = {{ 12,2,4 },{ 6,8,1 },{ 11,7,3 },{ 5,9,10 }};

        System.out.println("--ORIGINAL MATRIX");
        printMatrix(a);

    sortRows(a);

        System.out.println("--SORTED--");
        printMatrix(a);
    }

    static void sortRows (int a[][])
    {
        int N = a.length;
        
    for(int i=0; i<=N-1; i++)
    {
        Arrays.sort(a[i]);
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
