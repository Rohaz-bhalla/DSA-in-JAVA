package StringsDemo;

import java.util.StringTokenizer;

public class longestWord 
{
    public static void main(String[] args) 
    {       
        String s = "Hi my name is Rohaz";
        System.out.println(longest(s));
    }

    static String longest (String s)
    {
        StringTokenizer st = new StringTokenizer(s);
        int n = st.countTokens();
        String ans = "";
         
        for (int i=0; i<n; i++)
        {
            String word = st.nextToken();           
            if(word.length()>ans.length())
            {
                ans = word;
            }
        }
        return ans;
    }
}
