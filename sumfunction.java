
import java.util.Scanner;
public class sumfunction {
    public static void main(String[] args) {
        sum();
        System.out.println(" ");
        sum();
        
    }

    static void sum() {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = in.nextInt();
        System.out.print("Enter the second number: ");
        int b = in.nextInt();
        int sum = a + b;
        System.out.print("The sum is: " +sum);
        
    }

    
}
