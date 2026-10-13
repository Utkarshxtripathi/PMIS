public class Exception {
    public static void main(String[] args) {
        //  int a = 10;
        //  int b = 0;

        //  try {
        //      int result = a / b;
        //      System.out.println(result);
        //  } catch (ArithmeticException e) {
        //     System.out.println("You cannot divide by 0.");
        //  }

        try {
            int[] numbers = {10, 20, 30};
             System.out.println(numbers[5]);
             int res = 10/0;
             System.out.println(res);
            } catch (ArrayIndexOutOfBoundsException e) {
               System.out.println("Invalid array index");
            } catch (ArithmeticException e) {
                 System.out.println("Cannot divide by 0");
                }


    }
}