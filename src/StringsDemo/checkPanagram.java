package StringsDemo;

import java.util.*;

public class checkPanagram 
{
    public static void main(String[] args) 
    {
        String s = "the quick brown fox jumps over lazy dog";
        System.out.println(isPanagram(s));
    }

    static Boolean isPanagram (String s)
    {
       HashSet <Character> hs = new HashSet<>();
       s = s.toLowerCase();

       for(int i=0; i<s.length(); i++)
       {
        char ch = s.charAt(i);
        if(Character.isLetter(ch))
        {
            hs.add(ch);
        }
       }
       if(hs.size()==26)
        {
            return true;
        }
        else
        {
           return false;
        }
    }
}
