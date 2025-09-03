package Tree_Recursion;

import java.util.ArrayList;

public class josephus_problem //LC 1823
{
    public static void main(String[] args) 
    {
        int N = 7;
        int K = 3;

        System.out.println( findWinner( N, K ) );
    }

    static int findWinner( int N, int K )
    {
        ArrayList<Integer> al = new ArrayList<>();

        // add peoples from 1 to end
        for( int i = 1; i <= N; i++ )// n-1 isn't used bcz size is decreasing after each round
        {
            al.add(i);
        }

        int i = -1; // circle main ghusne se pele bcz in this problem counting starts from 1

        while ( true ) 
        {
            System.out.println(al);
            i = ( i + K ) % al.size(); // % here used for circular traversal
            al.remove(i);

            i = i - 1; //firse ek piche se count shuru kra

            if( al.size() == 1 ) break;

        }
        return al.get(0);
    }
}