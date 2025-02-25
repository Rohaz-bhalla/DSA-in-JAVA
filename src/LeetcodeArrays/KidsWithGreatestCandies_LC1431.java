package LeetcodeArrays;

import java.util.*;

public class KidsWithGreatestCandies_LC1431 
{
    public static void main(String[] args) 
    {
        int a[] = {2,3,5,1,3};
        int extraCandies =3;
        List <Boolean> b = KidsWithGreatestCandies(a, extraCandies);
        
        System.out.println(b);
        
    }

    static List<Boolean>KidsWithGreatestCandies(int a[], int extraCandies)
    {
        ArrayList<Boolean> al = new ArrayList<>();

        int max = 0;
        for(int i=0; i<=a.length-1; i++)
        {
            if(a[i]>max)
            {
                max = a[i];
            }
        }

        for (int i=0; i<=a.length-1; i++)
        {
            if(a[i] + extraCandies >= max)
            {
                al.add(true);
            }
            else
            {
                 al.add(false);
            }
        }
        return al;
    }
}
