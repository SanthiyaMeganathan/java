
import java.util.Arrays;

public class functionOverloading {

    public static void main(String[] args) {
        fun(1, 2, 3, 4, 5);
        fun(1);
        fun("shalini");
        fun(1, 2, "shalini");

    }
    
    static void fun(int a) {
        System.out.println(a);
    }

    static void fun(int a, int b) {
        System.out.println(a);
         System.out.println(b);
    }
        
    

    static void fun(String name) {
        System.out.println(name);

    }
    
    static void fun(int a, int b, String... myname) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(myname[0]);

    }
    
    static void fun(int a, int... n) {
        System.out.println(a);
        System.out.println(Arrays.toString(n));
        
    }
}
