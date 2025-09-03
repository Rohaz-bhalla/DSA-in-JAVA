package Tree_Recursion;

public class combinations 
{
    public static void main(String[] args) 
    {
        int N = 4;
        int R = 2;

        System.out.println( comb( N , R ) );
    }

    static int comb( int N, int R )
    {
        if( R == 0 || R == N )
        {
            return 1;
        }
        else
        {
            return comb(N - 1, R - 1) + comb(N - 1, R);
        }
    }
}
