package StringsDemo;

import java.util.*;

public class howManyAnagram 
{
    public static void main(String[] args) 
    {
        String s = "ABCHELLOCABWORLBCAROHAZ";
        String w = "ABC";

        System.out.println(countAnagram(s,w));
    }

    static int countAnagram(String s, String w)
    {
        int count = 0;
        int l = s.length() , k = w.length();
        for(int i=0; i<=l-k; i++)
        {
          String sub = s.substring(i, i+k);
          if(isAnagram(sub,w))
          {
            count++;
          }
        }
        return count;
    }
   static Boolean isAnagram(String s1, String s2)
   {
     char a[] = s1.toCharArray();
     char b[] = s2.toCharArray();

   
      Arrays.sort(a);
      Arrays.sort(b);
      return Arrays.equals(a, b);
    }
}
