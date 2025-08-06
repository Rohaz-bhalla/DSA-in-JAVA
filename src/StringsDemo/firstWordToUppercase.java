package StringsDemo;

import java.util.StringTokenizer;

public class firstWordToUppercase 
{
    public static void main(String[] args) 
    {
        String s = "hi myself rohaz";
        System.out.println(uppercasing(s));
    }

    static String uppercasing (String s)
    {
       StringTokenizer st = new StringTokenizer(s);
       int n = st.countTokens();
       String ans = "";

       for(int i=0; i<n; i++)
       {
        String word = st.nextToken();
        String CapitalWord = word.substring(0,1).toUpperCase()+word.substring(1).toLowerCase();
        ans = ans + CapitalWord + " ";
       }

       ans = ans.trim();

       return ans;
    }
}
