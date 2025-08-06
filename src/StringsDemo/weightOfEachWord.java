package StringsDemo;

import java.util.StringTokenizer;

public class weightOfEachWord 
{
    public static void main(String[] args) 
    {
        String s = "Apple Mango Grapes";
        System.out.println(weights(s));

    }

    static String weights (String s)
    {
        StringTokenizer st = new StringTokenizer(s);
        int n = st.countTokens();
        String ans = ""; 
        
        for (int i=0; i<n; i++)
        {
            String word = st.nextToken();
            int weight = 0;

            for (int j=0; j<word.length(); j++)
            {
                weight = weight + word.charAt(i);
            }
            ans = ans + word + " => " + weight + " "; 
        }
        ans = ans.trim();
        return ans;
    }
}
