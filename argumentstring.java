import java.util.Scanner;

public class argumentstring {
    
    public static void main(String[] args) {
    //    String Personalizedgreet = Greeting("shalini");
    //    System.out.println(Personalizedgreet);
    Scanner in = new Scanner(System.in);
       System.out.println("Enter your name");
       String namevalue = in.nextLine();
       String personalizedgreeting = Greeting(namevalue);
       System.out.println(personalizedgreeting);

       

    }
    
    static String Greeting(String name) {
        String greetings = "hello"+ " " +name;
        return greetings;
        
    }
    
}
