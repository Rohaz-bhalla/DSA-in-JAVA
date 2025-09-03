package Tree_Recursion;

public class ways_to_target_Sum 
{
    public static void main(String[] args) 
    {
        int a[] = { 1,2,3,4,5 };

        int target = 10;

        ways( a, target, 0, "", 0 );
    }

    static void ways( int a[], int target, int i, String ans, int sum )
    {
        if( i == a.length )
        {
            if( sum == target )
            {
                System.out.println( ans + "-->" + sum );
            }
            else
            {
                //System.out.println( ans + "--> X" );
            }
        }
        else
        {
            //include
            ways(a, target, i + 1, ans + a[i] + "", sum + a[i]);

/*
 * ans is a string that stores which numbers we’ve picked so far.

Adding a[i] appends the current number.

The + "" converts the integer into a string, so it can be concatenated with ans.

Example: If ans = "1 " and a[i] = 2, then → "1 2 "
*/

            //exclude
            ways(a, target, i + 1, ans, sum);
        }
    }
}
