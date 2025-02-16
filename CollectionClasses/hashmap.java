package CollectionClasses;


import java.util.*;

public class hashmap 
{
   public static void main(String[] args) 
   {
   
   HashMap<Integer,String> hm = new HashMap<>();
   hm.put(21,"Rohaz");
   hm.put(40,"Sham");
   hm.put(111,"Ram");
   hm.put(111,"Ram");
   hm.put(7,"rohan");
   hm.put(9,"han");
   hm.put(6,"Moh");
   hm.put(2111,"Rohaz");
   hm.put(4,"Sham");
   hm.put(1111,"Ram");
   hm.put(1,"Ram");
   hm.put(7,"rohan");
   hm.put(9,"han");
   hm.put(6,"Moh");
   
   // System.out.println(hm.get(2));  //used for fast searching

   for(Map.Entry<Integer,String> entry : hm.entrySet())
   {
      System.out.println("The keys are : "+entry.getKey()+  "The values are : "+entry.getValue());
   }
    } 
}
