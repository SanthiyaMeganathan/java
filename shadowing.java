public class shadowing {

    public static void main(String[] args) {
        int a = 10;
        int b = 22;
        System.out.println("a:" + a);
        System.out.println("b:" + b);
        shadow();


    }
    
    static void shadow() {
        int a = 13;
        int b = 19;
        System.out.println("a:" + a);
        System.out.println("b:" + b);

        }
    
}
