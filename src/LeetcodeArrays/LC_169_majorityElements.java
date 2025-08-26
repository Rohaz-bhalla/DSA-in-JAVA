package LeetcodeArrays;

import java.util.*;

public class LC_169_majorityElements 
{
    public static void main(String[] args) 
    {
        int a[] = { 2,2,2,1,1,1,2,2 };

        int b = majorityElements(a);

        System.out.println(b);
    }

    static int majorityElements(int a[])
    {
       
    HashMap <Integer,Integer> hm = new HashMap<>();

      int count = 0;
      int num = -1;

       for(int i:a)
       {
        if(hm.containsKey(i))
        {
            hm.put(i,hm.get(i)+1);
        }

        else if(!hm.containsKey(i))
        {
         hm.put(i, 1);
        }

        if(hm.get(i)>count)
        {
          count = hm.get(i);
          num = i;
        }
        
    }
    return num;
    }

}
