class Solution {
    public List<List<String>> partition(String s) 
    {
        List<List<String>> res = new ArrayList<>();

        backtrack( s, 0, new ArrayList<>(), res );
        return res;
    }

    static void backtrack( String s, int i, List<String>ans, List<List<String>> res )
    {
        if( i == s.length() )
        {
           res.add( new ArrayList<>( ans ) );
           return;
        }
        
        for( int j = i ; j <= s.length() - 1; j++ )
        {
            String sub = s.substring( i, j + 1 );

            if( isPalindrome( sub ) )
            {
                //include branch
                ans.add( sub );//choose
                backtrack( s, j + 1, ans, res );//explore
                ans.remove( ans.size() - 1 );//unchoose
            }
        }
    }

    static boolean isPalindrome(String str) 
    {
      int l = 0, r = str.length() - 1;

        while (l < r) {
         if (str.charAt(l) != str.charAt(r)) 
        {
            return false;
        }
        l++; //move right
        r--;// move left
    }

    return true;
   }

}