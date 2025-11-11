import java.util.Scanner;

public class AdditionByTakingInput {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);  
      System.out.println("Enter any two numbers:");
      int a = sc.nextInt();
      int b = sc.nextInt() ;
      int sum = a+b;
      int diff = a-b;
      int mul = a*b;
      int div = a/b;
      int modulo = a%b;
      System.out.println("Sum of two numbers is: "+sum);
      System.out.println("Difference of two numbers is: "+diff);
      System.out.println("Product of two numbers is: "+mul);
      System.out.println("Division of two numbers is: "+div);
      System.out.println("The modulo of two numbers is: "+modulo);
    }
}
