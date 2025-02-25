package CollectionClasses;

import java.util.*;

public class arrayList 
{
    public static void main(String[] args) {
        // ArrayList<String> al = new ArrayList<>();
        LinkedList<String> al = new LinkedList<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String a = sc.nextLine();
        System.out.print("Enter your second name: ");
        String b = sc.nextLine();
        System.out.print("Enter your thrid name: ");
        String c = sc.nextLine();
        System.out.print("Enter your fourth name: ");
        String d = sc.nextLine();
        System.out.print("Enter your fifth name: ");
        String e = sc.nextLine();

        sc.close();

        al.add(a);
        al.add(b);
        al.add(c);
        al.add(d);
        al.add(e);

        System.out.println(al);

        //enhanced for-loop
        for (String p:al)
        {
        System.out.println(p);    
        }

    }
}
