package matrices;

public class rotate_matrix_by90 {
    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },{ 13,14,15,16 } };
        System.out.println("--ORIGINAL MATRIX--");
        printMatrix(a);

        rotateMatrix(a);
        System.out.println("--AFTER Rotation to 90*--");
        printMatrix(a);
    }

    static void rotateMatrix(int a[][]) {
        int i, j,
                M = a.length, // rows in original
                N = a[0].length; // cols in orig

                int b[][] = transpose(a);
                int c[][] = mirror(b);

                for(i=0; i<=M-1; i++)
                {
                    for(j=0; j<=N-1; j++)
                    {
                        a[i][j] = c[i][j];
                    }
                }
    }

    static int[][] mirror(int a[][]) {
        int i, j,
                M = a.length, // rows in original
                N = a[0].length; // cols in orig

        int b[][] = new int[M][N];

        for (i = 0; i <= M - 1; i++) {
            for (j = 0; j <= N - 1; j++) {
                b[i][N - 1 - j] = a[i][j];
            }
        }
        return b;
    }

    static int[][] transpose(int a[][])
    {
        int i,j, 
        M = a.length, //rows in original
        N = a[0].length; // cols in orig

        int b[][] = new int [N][M]; // flip dimensions means 3x4 => 4x3

        for (i=0; i<=M-1; i++)
        {
            for(j=0; j<=N-1; j++)
            {
                b[j][i] = a[i][j]; // flip positions of inner elements => rows to cols
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
