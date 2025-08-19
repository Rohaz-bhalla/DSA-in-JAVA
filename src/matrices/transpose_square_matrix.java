package matrices;

public class transpose_square_matrix 
{
    public static void main(String[] args) {
        int a [][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
         System.out.println("--ORIGINAL MATRIX--");
         printMatrix(a);

         transposeSquare(a);
         System.out.println("--AFTER TRANSPOSE--");
         printMatrix(a);
    }

    static void transposeSquare (int a[][]){

        int i,j,t,
        M = a.length, //rows in original
        N = a[0].length; // cols in orig

        for( i=0; i<=M-1; i++ )
        {
            for(j=1; j<=N-1; j++)
            {
                t = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = t;
            }
        }
    }

    static void printMatrix(int a [][])
    {
        System.out.println("The matrix is");
        for(int i=0; i<=a.length-1;i++)
        {
            for(int j=0; j<=a[i].length-1; j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
