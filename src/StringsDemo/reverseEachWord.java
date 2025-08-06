package StringsDemo;

import java.util.StringTokenizer;

public class reverseEachWord 
{
    public static void main(String[] args) 
    {
        String s = "Rohaz Bhalla";

        System.out.println(reverse(s));
    }

    static String reverse (String s)
    {
        StringTokenizer st = new StringTokenizer(s);
        int n = st.countTokens(); //count no. of words

        String ans = "";


        for (int i=1; i<=n; i++)
        {
            String word = st.nextToken();
            StringBuffer sb = new StringBuffer(word);
            sb.reverse();
            ans = ans+sb.toString()+" ";
        }
        ans = ans.trim();

        return ans;
    }
}
