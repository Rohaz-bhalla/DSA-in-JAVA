class Solution {
    public int[] findDiagonalOrder(int[][] a) 
    {
        int i,j,
        row = 0,
        col = 0,
        M = a.length,
        N = a[0].length;
        int b[] = new int[M*N];

        for(i=0; i<M*N; i++)
        {
            b[i] = a[row][col]; // stored the element
            if((row + col )%2 == 0 ) // for i+j = even, row-- col++ => this will go upwards
            {
                if( col == N-1 )
                {
                    row++;
                }
                else if(row == 0)
                {
                    col++;
                }
                else
                {
                    col++;
                    row--;
                }
            }else
            {
               //odd means downwards => row++, col--
            if( row == M-1 )
            {
                col++;
            }
            else if(col == 0)
            {
                row++;
            }
            else
            {
                col--;
                row++;
            }
        }
            }
        return b;
    }
}