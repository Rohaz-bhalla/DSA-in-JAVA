package StringsDemo;

import java.util.HashMap;

public class keypadNumbers 
{
    public static void main(String[] args) 
    {
        String s = "hi";
        keypadNums(s);
    }

    static void keypadNums(String s)
    {
        HashMap<Character, Integer> hm = new HashMap<>();

        hm.put('a', 2);
        hm.put('b', 22);
        hm.put('c', 222);
        
        hm.put('d', 3);
        hm.put('e', 33);
        hm.put('f', 333);
        
        hm.put('g', 4);
        hm.put('h', 44);
        hm.put('i', 444);
        
        hm.put('j', 5);
        hm.put('k', 55);
        hm.put('l', 555);
        
        hm.put('m', 6);
        hm.put('n', 66);
        hm.put('o', 666);
        
        hm.put('p', 7);
        hm.put('q', 77);
        hm.put('r', 777);
        hm.put('s', 7777);
        
        hm.put('t', 8);
        hm.put('u', 88);
        hm.put('v', 888);
        
        hm.put('w', 9);
        hm.put('x', 99);
        hm.put('y', 999);
        hm.put('z', 9999);
        
        hm.put(' ', 0);

        for (int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);

            int val = hm.get(ch);
            System.out.println(val + "");
        }
    }
}
