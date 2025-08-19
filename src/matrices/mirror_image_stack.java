package matrices;

import java.util.Stack;

public class mirror_image_stack 
{
    public static void main(String[] args) 
    {
        int a [][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        System.out.println("ORIGINAL");
        printMatrix(a);

        int b[][] = mirrorStack(a);
       System.out.println("Mirror");
        printMatrix(b);
    }

    static int[][] mirrorStack(int a[][]) 
    {
        
        int i,j, 
        M = a.length, //rows in original
        N = a[0].length; // cols in orig
        
        int b[][] = new int[M][N];
        
        for(i=0; i<=M-1; i++)
    {
        Stack<Integer> st = new Stack<>();
        
        for(j=0; j<=N-1; j++)
           {
            st.push(a[i][j]);
           }
        
        for(j=0; j<=N-1; j++)
        {
            b[i][j] = st.pop();
        }
    }
        return b;
    }

    static void printMatrix(int a [][])
    {
       // System.out.println("The matrix is");
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
