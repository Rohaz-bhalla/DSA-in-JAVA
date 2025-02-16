import java.util.*;

public class delete_duplicates2 
{
   public static void main(String[] args) 
   {
      int a [] = { 1,2,3,4,5,5,5,6,7,7,8,8,8,8,9 };
      int c [] = deleteDuplicate(a);

      System.out.println(Arrays.toString(c));
   }    

   static int[] deleteDuplicate(int a [])
   {
    ArrayList<Integer> al = new ArrayList<>();

    al.add(a[0]);

    for(int i=1; i<=a.length-1; i++)
    {
        if (a[i] != a[i-1])
        {
            al.add(a[i]);
        }
    }

    int d []= new int [al.size()];
    for (int i=0; i<=al.size()-1; i++)
    {
        d[i] = al.get(i);
    }
    return d;
   }
}
