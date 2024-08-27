import java.util.Scanner;

public class newswitch {
    public static void main(String[] args) {
        System.out.print("Enter the day of the week that you like : ");
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();

        switch (day) {
            case 1 -> {
                System.out.println("monday");
                System.out.println("first day of the week");
        }
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("enter the valid number");

        }
    }
    
}
