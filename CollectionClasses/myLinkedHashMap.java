package CollectionClasses;


import java.util.*;

public class myLinkedHashMap 
{
public static void main(String[] args) 
 {
   LinkedHashMap <Integer,String> lhm = new LinkedHashMap(); 
   lhm.put(1,"abc");
   lhm.put(10,"xyz");
   lhm.put(5,"pqr");

   for(Map.Entry<Integer,String> entry : lhm.entrySet())
   {
   System.out.println("The key is :"+entry.getKey()+"The value is :"+entry.getValue());
   }

 }    
}
