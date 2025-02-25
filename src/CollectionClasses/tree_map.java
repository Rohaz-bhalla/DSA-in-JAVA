package CollectionClasses;

import java.util.*;

public class tree_map 
{
public static void main(String[] args) 
  {
    TreeMap<Integer, String> tm = new TreeMap<>();
     tm.put(5,"Ram");
     tm.put(2, "Sham");
     tm.put(8,"Mohan"); 
     tm.put(1,"Rohaz");

    for(Map.Entry<Integer,String> entry : tm.entrySet())
   {
       System.out.println("The key is :"+entry.getKey()+"The value is :"+entry.getValue());
   }
  }    
}
