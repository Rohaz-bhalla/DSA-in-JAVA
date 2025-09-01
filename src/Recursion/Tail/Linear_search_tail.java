package Recursion.Tail;

public class Linear_search_tail 
{
    public static void main(String[] args) {
    int arr [] = { 10,20,30,40,50 };

    search( arr, 30, 0, false );
}

    static void  search( int arr[], int num, int i, boolean found )
    {
        if( found == true )
        {
        System.out.println(" Found At " + (i - 1)); // i++ hoi jara next pe jayga vapis lane ke lite i-1

        }
        else if( i == arr.length )
        {
            System.out.println(" Not Found ");
        }
        else
        {
            if( num == arr[i] )
            {
                found = true;
            }
            search(arr, num, i + 1, found);
        }
    }
}
