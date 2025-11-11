import java.util.*;

public class returnGreater {
    public static void greater(int a, int b) 
    {
          if(a > b && b != a){
            System.out.print("The first number is greater ->");
        }else if(b > a && a != b){
            System.out.print("The second number is greater ->");
        }
        else{
          System.out.print("Both numbers are equal");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Enter your first Number :");
        int a = sc.nextInt();

        System.out.print("Enter your second Number :");
        int b = sc.nextInt();
       greater(a,b);;
    }
}
