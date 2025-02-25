// To check the sum with the targeted value which is given

import java.util.*;

public class checkSum 
{
    public static void main(String[] args) 
    {
      int a[] = { 1,4,2,5,7,9,10 };
      int target_value = 12;  

      System.out.println(TwoSum( a,  target_value));
    }

    static boolean TwoSum(int a[], int target_value)
    {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<=a.length-1; i++)
        {
            int c = target_value - a[i];

            if (hm.containsKey(c))
            {
                return true;
            }
           
            hm.put(a[i],i);

        }

        return false;

    }
}
