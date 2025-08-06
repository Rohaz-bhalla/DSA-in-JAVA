package StringsDemo;

public class writeAllSubstring 
{
    public static void main(String[] args) 
    {
        String s = "ABCCABBCA";
          allSubstrings(s);
    }

    static void allSubstrings (String s)
    {
        int l = s.length();
        for(int i=0; i<=l; i++)
        {
            System.out.println("size :" + i);
            substringskSize(s,i);
            System.out.println("-----");
        }
    }

    static void substringskSize(String s, int k)
    {
        int l = s.length();
        for(int i=0; i<=l-k; i++)
        {
            String sub = s.substring(i, i+k);
            System.out.println(sub);
        }
    }
}
