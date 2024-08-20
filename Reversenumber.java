public class Reversenumber {
    public static void main(String[] args) {
        int num = 12345;
        System.out.print("The reversednumber : ");
        while (num > 0) {
            int rem = num % 10;
            System.out.print(rem);
            num = num / 10;  
        }
    }
    
}
