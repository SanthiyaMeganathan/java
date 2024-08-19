public class Ifexample {
    public static void main(String[] args) {
                int salary = 10000;
         if (salary > 9000) {
            salary+=500;
            System.out.println("salary is :  "+salary);
        
    }else if (salary > 8000){
        salary+=400;
        System.out.println("salary is : " + salary);
    }else{
        salary+=300;
        System.err.println("your salary is "+ salary);

    }
   
    }

}
