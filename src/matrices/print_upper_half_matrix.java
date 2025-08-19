package matrices;

public class print_upper_half_matrix 
{
    public static void main(String[] args) 
    {
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        printUpperHalf(a);
    }
    static void printUpperHalf(int a[][])
    {
        for(int i=0; i<=a.length-1;i++)
        {
           for(int j=0; j<=a[i].length-1;j++)
           {
            if(i>=j)
            {
                System.out.print(a[i][j]+"\t");
            }else
            {
                System.out.print("\t");
            }
           }
           System.out.println();
        }
    }
}
