
import java.util.Scanner;

class variable {
    public static void main(String[] args) {
        int container = 1;
        System.out.println(container);
        System.out.println("hi");
        System.out.print("Enter the rollnumber: ");
        Scanner input = new Scanner(System.in);
        int rollnum = input.nextInt();
        System.out.println("your roll num is:" + rollnum);
        System.out.println("enter the mark");

        Scanner inputofmark = new Scanner(System.in);
        float mark = inputofmark.nextFloat();
        System.out.println("your mark is:"+mark);
        
    }

}
