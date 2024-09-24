
import java.util.Arrays;

public class vararg {

    public static void main(String[] args) {

        fun(1, 2, 3, 3, 4, 56, 5);


    }
    
    static void fun(int ...v) {
        System.out.println(Arrays.toString(v));
    }
    
}
