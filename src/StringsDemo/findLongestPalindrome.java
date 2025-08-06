package StringsDemo;

public class findLongestPalindrome 
{
    public static void main(String[] args) 
    {
        String s = "RACECAR MADAM BOB";
        System.out.println(longestPalindrome(s));
    }

    static int longestPalindrome (String s)
    {
        int l = s.length();
        int max = 1;

        for (int i=2; i<=l; i++)
        {
            int ans = substingKSize(s,i);
            if(ans > max)
            {
                max = ans;
            }
        }
        return max;
    }

    static int substingKSize(String s, int k)
    {
        int l = s.length();
        int flag = 0;
        for (int i=0; i<=l-k; i++)
        {
            String sub = s.substring(i, i+k);
            if(isPalindrome(sub))
            {
                flag = 1;
                break;
            }
        }

        if(flag == 1)
        {
            return k;
        }

        else 
        {
            return -1;
        }
    }

    // static Boolean isPalindrome(String s)
    // {
    //     return new StringBuffer(s).reverse().toString().equals(s);    // sir appraoch
    // }



    static Boolean isPalindrome(String s)
{
    // Step 1: Convert the string into a StringBuffer
    StringBuffer sb = new StringBuffer(s);
    
    // Step 2: Reverse the string using StringBuffer's reverse() method
    sb.reverse();
    
    // Step 3: Convert the reversed StringBuffer back to a string
    String reversedString = sb.toString();
    
    // Step 4: Compare the original and reversed string
    if (reversedString.equals(s)) // If they are the same, it's a palindrome
    {
        return true;
    }
    else
    {
        return false;
    }
}

}
