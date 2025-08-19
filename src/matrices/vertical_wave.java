package matrices;

import java.util.Arrays;

public class vertical_wave 
{
    public static void main(String[] args) 
    {
        int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },{ 13,14,15,16 } };

        printMatrix(a);
        System.out.println( );
        int ans[] = VerticalWave(a);
        System.out.println(Arrays.toString(ans));
    }

    static int[] VerticalWave(int a[][])
    {
        int i,j,k,
        M = a.length,
        N = a[0].length;

        int b[] = new int [M*N];

        k = 0;

        for(j=0; j<=N-1; j++)
        {
            if(j%2==0)
            {
                for(i=0; i<=M-1; i++)
                {
                    b[k] = a[i][j];
                    k++;
                }
            }else
            {
                for(i=M-1; i>=0; i--)
                {
                    b[k] = a[i][j];
                    k++;
                }
            }
        }
        return b;
    }

    // To print in the form of matrix(optional)
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
