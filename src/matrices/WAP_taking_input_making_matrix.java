package matrices;
import java.util.*;

public class WAP_taking_input_making_matrix 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][3];
        System.out.println("Enter any 9 elements with spaces to form a 3x3 matrix -:");

        for(int i=0; i<=2; i++)
        {
            for(int j=0; j<=2; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        sc.close();

        printMatrix(a);
    }

    static void printMatrix(int a [][])
    {
        System.out.println("The matrix is");
        for(int i=0; i<=a.length-1;i++)
        {
            for(int j=0; j<=a[i].length-1; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
