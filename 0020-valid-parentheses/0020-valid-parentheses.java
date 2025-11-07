class Solution {
    public boolean isValid(String s) 
    {
        Stack<Character> st = new Stack<>();

        for( int i = 0; i <= s.length() - 1; i++ )
        {
            char ch = s.charAt(i);
             
            if( ch == '[' || ch == '{' || ch == '(' )
            {
                st.push(ch);
            }
            
            else if( st.isEmpty() )
            {
               return false;
            }
            else
            {
                char check = st.pop();

                if( !( (check == '[' && ch == ']') ||
                (check == '{' && ch == '}') ||
                (check == '(' && ch == ')') ) )
                {
                   return false;
                }
            }
        }
        return st.isEmpty();
    }
}