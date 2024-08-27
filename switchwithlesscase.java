import java.util.Scanner;

public class switchwithlesscase {
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();
        switch (day) {

            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("weekday");
                break;
            
            case 6:
            case 7:
                System.out.println("Weekend");
            
                break;

            default:
                System.out.println("Invalid day");
                break;
            
                
            

               

        }
    }
}
