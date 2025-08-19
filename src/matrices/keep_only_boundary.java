package matrices;

public class keep_only_boundary 
{
    public static void main(String[] args) 
    {
        int a[][] = { {1,2,3,4,5,6}, {7,8,9,10,11,12}, {13,14,15,16,17,18}, {19,20,21,22,23,24} };
        
        keepOnlyBoundary(a);
    }

    static void keepOnlyBoundary(int a[][])
    {
        int i, j,
        M = a.length,
        N = a[0].length;

        for(i=0; i<=M-1; i++)
        {
            for(j=0; j<=N-1; j++)
            {
                if( i == 0 || i == M-1 || j == 0 || j == N-1 )
                {
                    // Boundary element
                    System.out.print(a[i][j] + "\t");
                } 
                else
                {
                    // Inner element → blank space
                    System.out.print(" \t");
                }
            }
            // Move to next row
            System.out.println();
        }
    }
}