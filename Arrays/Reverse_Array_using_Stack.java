package Arrays;

import java.util.*;

public class Reverse_Array_using_Stack 
{
  public static void main(String[] args) 
  {
       int a[] = { 1,2,3,4,5,6,7,8,9,10 };

       reverseArray(a);

  }    

static void reverseArray(int a[])
  {

    ArrayList<Integer> al = new ArrayList<>();
    Stack <Integer> st = new Stack<>();
    
    for(int p : a)
     {
        st.push(p);
     }

    while(! st.isEmpty())
    {
        System.out.println(st.pop());
    }
  }

}
