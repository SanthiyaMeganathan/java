import java.util.Scanner;

public class Fibbonaciexample {
    public static void main(String[] args) {
        System.out.println("Enter the value of n: ");

        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int a = 0;
        int b = 1;
        int count =2;

        while (count <= n) {
            int temp = b;
            b = b+ a;
            a = temp;
            count++;

        }
        System.out.println(b);

        
        
    }
    
}
