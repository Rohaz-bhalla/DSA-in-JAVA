package Tree_Recursion;

import java.util.Stack;

//LC 20
public class valid_paranthesis 
{
    public static void main(String[] args) 
    {
        String s = "{(())";

        System.out.println( isValid( s ) );
    }

    static boolean isValid( String s )
    {
        boolean match = false;

        Stack<Character> st = new Stack<>();

        for( int i = 0; i <= s.length() - 1; i++ )
        {
            char ch = s.charAt(i);

            if( ch == '[' || ch == '{' || ch == '(' )
            {
                st.push(ch);
            }
            else if( ch == ']' || ch == '}' || ch == ')' )
            {
                if( st.isEmpty() )
                {
                    return false;
                }
                else
                {
                    char check = st.pop();

                    if( ( check == '[' && ch == ']' ) || ( check == '{' && ch == '}' || ( check == '(' || ch == ')' ) ) )
                    {
                        match = true;
                    }
                    else
                    {
                        return false;
                    }
                }
            }
        }
        return match && st.isEmpty();
    }
}
