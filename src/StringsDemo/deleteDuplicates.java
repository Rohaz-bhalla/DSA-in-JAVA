package StringsDemo;

public class deleteDuplicates 
{
    public static void main(String[] args) 
    {
        String s = "heeeee isss sooo gayyy";
        System.out.println(removeDuplicate(s));
    }

    static String removeDuplicate(String s)
    {
        StringBuffer sb = new StringBuffer(s);
        for (int i=0; i<sb.length()-1; i++)
        {
            if(sb.charAt(i)==sb.charAt(i+1))
            {
                sb.deleteCharAt(i);
                i--;
            }
        }
        return sb.toString();
    }
}
