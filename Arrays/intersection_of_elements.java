import java.util.*;

public class intersection_of_elements 
{
    public static void main(String[] args) 
    {
        int a[] = { 1,2,3,4,5,6 };
        int b[] = { 5,6,7,8,9,10 };
        int c[] = intersection(a,b);

        System.out.println(Arrays.toString(c));
       
    }   
    
    static int[] intersection(int a[], int b[])
    {
        ArrayList<Integer> al = new ArrayList<>();
        HashSet<Integer> hs = new HashSet<>();

        for(int i=0; i<=a.length-1; i++)
        {
            hs.add(a[i]);
        }

        for(int i=0; i<=b.length-1; i++)
        {
            if(hs.add(b[i]) == false)  //already exists in the HashSet hs.
            {
                al.add(b[i]);
            }
        }

        int c[] = new int [al.size()];
        int i = 0;

        for (int p:al)
        {
            c[i] = p;
            i++;
        }
        
        return c;

    }

}
