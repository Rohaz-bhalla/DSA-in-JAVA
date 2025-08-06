package StringsDemo;

public class minCharForPalindrome
{
    public static void main(String[] args) 
    {
        String s = "ABBC";
        System.out.println(makePalindrome(s));
    }
    static int makePalindrome (String s)
    {
       if(isPalindrome(s))
       {
        return 0;
       }
       else
       {
        String original = s;
        int l = s.length();
        int ans = 0;

        for (int i=0; i<l; i++)
        {
            String sub = original.substring(0,i);
            String rev = new StringBuffer(sub).reverse().toString();

            if(isPalindrome(s+rev))
          {
            ans = rev.length();
            break;
          }
        }
        return ans;
       }
    }
    static Boolean isPalindrome (String s)
    {
        return new StringBuffer(s).reverse().toString().equals(s);
    }
}
