import java.util.Scanner;

public class LowerUpper {
    public static void main(String[] args) {
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.println(i + " is a lowercase letter");
        }
        int a = 'Z';
        System.out.println(a);
        Scanner Input = new Scanner(System.in);
        char ch = Input.next().trim().charAt(0);
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        } else {
            System.out.println("Uppercase");

        } 

        
    }
    
}
