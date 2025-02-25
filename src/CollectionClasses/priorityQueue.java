package CollectionClasses;


import java.util.*;

public class priorityQueue
{
public static void main(String[] args) 
{
     // PriorityQueue<Integer> pq = new PriorityQueue<>();  //uses min-Heap by default(asc order)

     PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());  // uses max-heap(desc order)

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
     
    sc.close();

    pq.add(a);
    pq.add(b);
    pq.add(c);
    pq.add(d);
    pq.add(e);

    System.out.println(pq);


while (!pq.isEmpty()) {
    System.out.println(pq.remove());
}
   
 }    
}
