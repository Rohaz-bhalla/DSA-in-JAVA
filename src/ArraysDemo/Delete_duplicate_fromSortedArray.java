package ArraysDemo;


import java.util.*;

public class Delete_duplicate_fromSortedArray 
{
  public static void main(String[] args) 
  {
    int a[] = { 1,1,1,2,3,4,4,5,5,6,6,6,6,7 };
    int b [] = deleteDuplicate(a);

    System.out.println(Arrays.toString(b));
  }  

    static int [] deleteDuplicate (int a [])
    {
        ArrayList <Integer> al = new ArrayList<>();
        for(int i=0; i<=a.length-1; i++)
        {
            al.add(a[i]);
        }

        
    for(int i=0; i<= al.size()-2; i++)
    {
        if(al.get(i) == al.get(i+1))
        {
            al.remove(i);
            i--;
        }
    }
    
    int b [] = new int [al.size()];
    for (int i=0; i<=al.size()-1; i++)
    {
        b[i] = al.get(i);
    }
    return b;
    } 

    
}
