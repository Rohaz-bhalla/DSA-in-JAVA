import java.util.*;

public class printOdd {

public static void printOdds(int n)
{
    int sum = 0;

    for(int i=1; i<=n; i++){
     if(i % 2 != 0){
        sum = sum + i;
     }
    }
   System.out.println(sum); 
  
}

public static void main(String[] args) {
    System.out.print("Enter your number :");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    printOdds(n);
}

}
