import java.util.Scanner;


public class switchwithlessnwe {

    public static void main(String[] args) {

        System.out.print("enter the day of the week: ");
        Scanner input = new Scanner(System.in);

        int day = input.nextInt();

        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("weekday");
            case 6, 7 -> System.out.println("weekend");
            default -> System.out.println("enter the valid day frome 1 to 7");
        }
    }
    
}
