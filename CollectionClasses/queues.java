package CollectionClasses;


import java.util.*;

public class queues 
{
    //de-queue

    public static void main(String[] args)
    {
    ArrayDeque<Integer> dq = new ArrayDeque<>();
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

    dq.addFirst(a);
    dq.addFirst(b);
    dq.addFirst(c);
    dq.addLast(d);
    dq.addLast(e);

    System.out.println(dq);

    while (!dq.isEmpty())
    {
    System.out.println(dq.removeFirst());    
    }

    }
}
