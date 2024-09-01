import java.util.Scanner;

public class parameternum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the num2: ");
        int num2 = sc.nextInt();
        int sumvalue = sum(num1, num2);
        System.out.println("Sum of num1 and num2 is " + sumvalue);

    }

    static int sum(int a, int b) {
        return a + b;
    }
    

    
}
