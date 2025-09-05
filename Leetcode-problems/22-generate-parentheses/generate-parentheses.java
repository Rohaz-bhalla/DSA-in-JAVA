class Solution {
    public List<String> generateParenthesis(int n) 
    {
        List<String> al = new ArrayList<>();

        generateParenthesis( n, n, "", al );
        return al;
    }

    static void generateParenthesis( int open, int close, String ans, List<String> al )
    {
        if( open == 0 && close == 0 )
        {
            al.add( ans );
        }
        else
        {
            if( open > 0 )
            {
                generateParenthesis( open - 1, close, ans + "(", al );
            }
            if( close > 0 && close > open )
            {
                generateParenthesis( open, close - 1, ans + ")", al );
            }
        }
    }
}