package StringsDemo;

import java.util.*;

public class checkAnagram 
{
    public static void main(String[] args) 
    {
        String a = "ABC";
        String b = "BCA";
        System.out.println(isAnagram(a,b));
    }

    static Boolean isAnagram (String a, String b)
    {
        HashMap <Character, Integer> hm1 = new HashMap<>();
        HashMap <Character, Integer> hm2 = new HashMap<>();

        for (int i=0; i<a.length(); i++)
        {
          char ch1 = a.charAt(i);
          int val = hm1.getOrDefault(ch1, 0); 
          val++;
          hm1.put(ch1,val);
        }


        for (int i=0; i<b.length(); i++)
        {
          char ch2 = b.charAt(i);
          int val = hm2.getOrDefault(ch2,0);
          val++;
          hm2.put(ch2,val);
        }
     
        if (hm1.equals(hm2))
        {
            return true;
        }

        else
        {
           return false;
        }
    }
}
