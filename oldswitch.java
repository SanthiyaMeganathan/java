import java.util.Scanner;

public class oldswitch {


    public static void main(String[] args) {
        System.out.println("Enter the Fruit name: ");
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "apple": {
                System.out.println("The color of the apple is red.");
                break;
            }
            case "banana": {
                System.out.println("The color of the banana is yellow.");
            
            }
            case "orange": {
                System.out.println("The color of the orange is orange.");
                break;
            }
            default: {
                System.out.println("Sorry, we don't have information about that fruit.");
            }
        }

    }
    
}
