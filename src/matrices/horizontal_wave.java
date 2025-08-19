package matrices;

import java.util.Arrays;

public class horizontal_wave 
{
    public static void main(String[] args) 
    {
        int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 },{ 13,14,15,16 } };
        
        int ans[] = HorizontalWave(a);
        System.out.println(Arrays.toString(ans));
    }

    static int[] HorizontalWave(int a[][])
    {
        int i,j,k,
        M = a.length,
        N = a[0].length;

        int b[] = new int[M*N];

        k = 0; //output array

        for(i=0; i<=M-1; i++) //Even row --> Right to left
        {
            if(i%2==0)
            {
                for(j=0; j<=N-1; j++)
                {
                    b[k] = a[i][j];
                    k++;
                }
            }
            else // Odd row --> left to right
            {
                for(j=N-1; j>=0; j--)
                {
                    b[k] = a[i][j];
                    k++;
                }
            }
        }
        return b;
    }
}
