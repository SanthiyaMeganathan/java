
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        System.out.println("Enter the integer to sum");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int Sum = num1 + num2;
        System.out.println("The sum of the two numbers is: " + Sum);

        int number = (int) (9.00);
        System.out.println(number);

        byte a = (byte) (278);
        System.out.println(a);

        int charecter = 'a'; //97 A //64
        System.out.println(charecter);


        char avalue = 'a';
        short s = 123;
        byte b = 24;
        int i = 12345;
        double d = 12.3;
        float f = 12.3f;
        System.out.println((avalue + s)+" "+ - (b + f) + "  " + (d - i));





    }
    
}
