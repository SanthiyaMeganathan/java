
import java.util.Scanner;

public class sumreturn {



    public static void main(String[] args) {

     
        //returned value will not get printed automatically
        //we need to print it manually
        int ans = sum();
        System.out.println(ans);

    }
    
    static int sum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        int sum = a + b;
        return sum;
    }
    
}
