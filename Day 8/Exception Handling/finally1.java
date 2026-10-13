//package Day 8.Exception Handling;

public class finally1 {
    public static void main(String[] args) {
        try{
            int res = 10/0;
        }catch(ArithmeticException e){
            System.out.println("cannot divide by 0");
        }finally{
            System.out.println("Finally Executed");
        }
    }
    
}
