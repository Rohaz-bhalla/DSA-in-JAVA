package LeetcodeArrays;
import java.util.*;

public class Leetcode136_singleNumber 
{
    public static void main(String[] args) 
    {
        int a[] = { 1,2,1,2,4 };

        System.out.println(singleNumber(a));
    }

    static int singleNumber(int a[])
    {
       HashMap <Integer, Integer> hm = new HashMap<>();

       for(int i:a)
       {
        if(hm.containsKey(i))
        {
            hm.put(i,hm.get(i)+1);
        }

        else
        {
            hm.put(i,1);
        }
       }

       for(int i:a)
       {
        if(hm.containsKey(i) && hm.get(i)==1)
        {
            return i;
        }
       }
       return -1;

    }
}
