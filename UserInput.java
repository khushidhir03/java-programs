import java.util.Scanner;

public class UserInput {

    public static void main( String args[]) {

        Scanner scanner = new Scanner(System.in);

        int a,b=20;
        float f;
        char c;

        System.out.println("Enter the value of a");
        a = scanner.nextInt();
        System.out.println("Entered value of a is " +a);

        System.out.println("ENter the float value");
        f = scanner.nextFloat();

        System.out.println("Enter the char value");
        c = scanner.next().charAt(0);

        
     }
}