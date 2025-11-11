class Solution {
    public boolean isAnagram(String s, String t) 
    {
        if( s.length() != t.length() ) return false;

        // convert strings to char arr
        char[] ss = s.toCharArray();
        char[] st = t.toCharArray();

        Arrays.sort(ss);
        Arrays.sort(st);

        for( int i = 0; i <= ss.length - 1; i++ )
        {
            if( ss[i] != st[i] )
            {
                return false;
            }
        }
        return true;
    }
}