class Solution {
    public List<String> letterCasePermutation(String s) 
    {
        List<String> res = new ArrayList<>();
        letters( s, 0, "", res );
        return res;
    }

    static void letters( String s, int i, String ans, List<String>res )
    {
        if( i == s.length() )
        {
            res.add( ans );
            return;
        }
        
        char ch = s.charAt( i );

        if( Character.isLetter( ch ) )
        {
            letters( s, i + 1, ans + Character.toUpperCase( ch ), res );
            letters( s, i + 1, ans + Character.toLowerCase( ch ), res );
        }
        else
        {
            letters( s, i + 1, ans + ch, res );
        }
    }
}