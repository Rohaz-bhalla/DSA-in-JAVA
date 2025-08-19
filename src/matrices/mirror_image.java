package matrices;

public class mirror_image {
    public static void main(String[] args) {
        int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };

        System.out.println("original");
        printMatrix(a);

        int b[][] = mirror(a);
        System.out.println("mirror matrix");
        printMatrix(b);

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

    static void printMatrix(int a[][]) {
        // System.out.println("The matrix is");
        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = 0; j <= a[i].length - 1; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
