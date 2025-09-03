package Tree_Recursion;

public class target_sum_exist 
{
    public static void main(String[] args) 
    {
        int a[] = { 1,2,3,4,5 };

        int target = 10;

        System.out.println(ways( a, target, 0, "", 0 ));
    }

    static boolean ways( int a[], int target, int i, String ans, int sum )
    {
        if( i == a.length )
        {
            if( sum == target )
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            //include
            boolean ans1 = ways(a, target, i + 1, ans + a[i] + "", sum + a[i]);

            //exclude
            boolean ans2 = ways(a, target, i + 1, ans, sum);

            return ans1 || ans2; // used || => Because we want to know if at least one of the two choices leads to success
        }
    }    
}
