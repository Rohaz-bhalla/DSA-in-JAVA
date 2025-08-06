package StringsDemo;

public class maxVowelsPresent 
{
    public static void main(String[] args) 
    {
        String s = "ABCEJBIBDOWHU";
        int k =3;
        System.out.println(maxVowels(s,k));
    }

    static int maxVowels (String s, int k )
    {
        int l = s.length();
        int max = 0;

        //extract first window
        String sub = s.substring(0, 0+k);

        int c = countVowels(sub);

        if(c>max)
        {
            max = c;
        }

        for (int i=k; i<l; i++)
        {
            //letter to be removed to remove effect

            char old_char = s.charAt(i-k);
            
            if(countVowels(old_char+"")==1)
            {
                c--;
            }

            //now add effect of new character
            char new_char = s.charAt(i);

            if(countVowels(new_char+"")==1)
        {
            c++;
            if(c>max)
            {
                max = c;
            }
        }
    }
    return max;
    }

    static int countVowels (String s)
    {
        int count = 0;
        for (int i=0; i<=s.length()-1; i++)
        {
            char ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                  ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            {
                count++;
            }
        }
        return count ;
    }
}
