import java.util.*;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first number :");
        int a = sc.nextInt();

        System.out.print("Enter your second number :");
        int b = sc.nextInt();

        System.out.print("Enter your thrid number :");
        int c = sc.nextInt();
       
        
        int sum = a+b+c;
        System.out.println("The sum of three numbers is :"+sum);
    }
}
