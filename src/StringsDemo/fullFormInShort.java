package StringsDemo;

import java.util.StringTokenizer;

public class fullFormInShort 
{
     public static void main(String[] args) 
    {
        String s = "Last In First Out";
         System.out.println(shortForm(s));
    }    

     static String shortForm(String s)
    {
        StringTokenizer st = new StringTokenizer(s);
        int n = st.countTokens(); //count no. of words

        String ans = "";

        for(int i=1; i<=n; i++)
        {
            String p = st.nextToken(); // get each word correctly
            char ch = p.charAt(0); //get first word
            ch = Character.toUpperCase(ch);
            ans = ans + ch + ".";
        }

        return ans;
    }
}
