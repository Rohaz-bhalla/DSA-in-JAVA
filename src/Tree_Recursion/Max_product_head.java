package Tree_Recursion;

import java.util.*;

public class Max_product_head 
{
    public static void main(String[] args) 
    {
        int n = 8;
        
        System.out.println(maxProduct(n));
    }
    
    static int maxProduct(int n)
    {
        
        return maxProduct(n, "");
        
    }
    
    static int maxProduct(int n, String ans)
    {
        if(n==0)
        {
            int b[] = convertToIntArray(ans);
            
            int prod = 1;
            
            for(int i=0; i<=b.length-1; i++)
            {
                prod = prod * b[i];
            }
            
            //System.out.println(ans+"--> "+Arrays.toString(b) +"--> "+prod);
            
            return prod;
        }
        else
        {
            int overall_max=0;
            
            for(int i=1; i<=n; i++)
            {
                int temp_ans = maxProduct(n-i, ans+i+" ");
                
                if(temp_ans>overall_max)
                {
                    overall_max = temp_ans;
                }
            }
            
            return overall_max;
        }
    }
    
    static int[] convertToIntArray(String ans)
    {
        StringTokenizer st = new StringTokenizer(ans);
        
        int n = st.countTokens();
        
        if(n==0)
        {
            int b[] = new int[0];
            return b;
        }
        else
        {
            int b[] = new int[n];
            
            for(int i=0; i<=n-1; i++)
            {
                b[i] = Integer.parseInt(st.nextToken());
            }
            
            return b; 
        }
    }
}