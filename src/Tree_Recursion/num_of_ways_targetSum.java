package Tree_Recursion;

public class num_of_ways_targetSum 
{
        public static void main(String[] args) 
    {
        int a[] = { 1,2,3,4,5 };

        int target = 10;

        System.out.println(ways( a, target, 0, "", 0 ));
    }

    static int ways( int a[], int target, int i, String ans, int sum )
    {
        if( i == a.length )
        {
            if( sum == target )
            {
                return 1;
            }
            else
            {
                return 0;
            }
        }
        else
        {
            //include
            int ans1 = ways(a, target, i + 1, ans + a[i] + "", sum + a[i]);

            //exclude
            int ans2 = ways(a, target, i + 1, ans, sum);

            return ans1 + ans2;
        }
    }    
}
