package CollectionClasses;

import java.util.*;

public class stack_demo
{
public static void main(String[] args) 
  {
    System.out.println("Enter any 5 numbers.....");
    Stack <Integer> st = new Stack<>();
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your first number: ");
    int a = sc.nextInt();
    System.out.print("Enter your second number: ");
    int b = sc.nextInt();
    System.out.print("Enter your thrid number: ");
    int c = sc.nextInt();
    System.out.print("Enter your fourth number: ");
    int d = sc.nextInt();
    System.out.print("Enter your fifth number: ");
    int e = sc.nextInt();
    st.push(a);
    st.push(b);
    st.push(c);
    st.push(d);
    st.push(e);
    
    System.out.println("Size of the stack is: "+ st.size());
    System.out.println(st);

    System.out.println("-- The poped out or reversed stack is --");

    while(! st.isEmpty())
    {
        System.out.println(st.pop());
    }
   }    
}
