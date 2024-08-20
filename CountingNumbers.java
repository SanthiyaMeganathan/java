

public class CountingNumbers {
    public static void main(String[] args) {
       
        int num = 9795;

        int counting = 0;

        while (num > 0) {
            if (num % 10 == 9) {
                counting ++;
            }
            num = num / 10;
        }

        System.out.println("The number of 9 in the give number is : "+counting);
    }
    
}
