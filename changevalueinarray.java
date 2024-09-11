
import java.util.Arrays;

public class changevalueinarray {

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4 };
        change(arr);
        // System.out.println(arr)); this leads to error
         System.out.println(Arrays.toString(arr));

    }
    
    static void change(int[] num) {
        num[0] =99;
    }
    
}
