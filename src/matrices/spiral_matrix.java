package matrices;

public class spiral_matrix {
    public static void main(String[] args) {
        int N = 10;   // change size here

        int[][] a = generateMatrix(N);
        printMatrix(a);
    }

    public static int[][] generateMatrix(int N) {
        int[][] a = new int[N][N];

        int i, j, k, x1, x2, y1, y2;

        x1 = 0;
        y1 = 0;
        x2 = N - 1;
        y2 = N - 1;

        i = 0;
        j = 0;
        k = 1;

        outer:
        while (true) {
            // Go Right →
            for (j = y1; j <= y2; j++) 
            {
                a[i][j] = k;
                if (k == N * N) break outer;  //  stop exactly at last cell
                k++;
            }
            j--;
            x1++;

            // Go Down ↓
            for (i = x1; i <= x2; i++) 
            {
                a[i][j] = k;
                if (k == N * N) break outer;
                k++;
            }
            i--;
            y2--;

            // Go Left ←
            for (j = y2; j >= y1; j--) 
            {
                a[i][j] = k;
                if (k == N * N) break outer;
                k++;
            }
            j++;
            x2--;

            // Go Up ↑
            for (i = x2; i >= x1; i--) 
            {
                a[i][j] = k;
                if (k == N * N) break outer;
                k++;
            }
            i++;
            y1++;
        }

        return a;
    }

    static void printMatrix(int[][] a) {
        System.out.println("Spiral Matrix:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
