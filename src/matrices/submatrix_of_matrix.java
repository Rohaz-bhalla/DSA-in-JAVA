package matrices;

public class submatrix_of_matrix 
{
    public static void main(String[] args) 
    {
        int a[][] = {{ 1,1,1,1,1,1 },{ 2,2,2,2,2,2 }, { 3,3,3,3,3,3 },{ 4,4,4,4,4,4 }};

        System.out.println("--ORIGINAL MATRIX");
        printMatrix(a);

        int b[][] = submatrix(a);

        System.out.println("--SUBMATRIX--");
        printMatrix(b);
    }

    static int[][] submatrix(int a[][])
    {
        int i,j,
        M = a.length,
        N = a[0].length;

        int b[][] = new int[M-2][N-2]; // removing 1 row and col from all sides

        // we are starting from 1 bcz we have to skip first and last row and col
        for(i=1; i<=M-2; i++)
        {
            for(j=1; j<=N-2; j++)
            {
                b[i-1][j-1] = a[i][j]; //adjust the indexes as the sides are removed and new matrix will start from i-1
            }
        }
        return b;
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
