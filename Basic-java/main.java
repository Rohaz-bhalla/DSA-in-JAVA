/**
 * main
 */
public class main {

    public static void main(String[] args) {
        System.out.println("hello world");
        //variables
        String name = "Hitaishi";
        int age = 20;
        String gender = "Female";

        //data types
        int phone = 1234567890;
        long phone2 = 12345678900L;
        char letter = 'a';
        boolean isMale = true;

        //non primative data type
        String name2 = "Rohaz";
        System.out.println(name2.length());

        String name3 ="apu";
        String friend = new String("akku");
        System.out.println(name3.length());
        System.out.println(name3.charAt(0));

        //concatenate
        String name4 =name+ " loves "+name2;
        System.out.println(name4);

        //replace
        String name5 = name3.replace('a','l');
        System.out.println(name5);


      
    }
}