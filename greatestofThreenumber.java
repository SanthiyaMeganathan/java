import java.util.Scanner;

public class greatestofThreenumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers with space: ");

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max = a;

        if (b > max) {
            max = b;
    

        } 
        if (c > max) {
            max = c;
            System.out.println(max);

        } else {
            System.out.println(max);
        }

    }
}
