public class ExceptionHandling6A {
    // User defined Exceptions
    public static void main(String[] args) {
        int j = 5;
        try {
            if (j > 1) {
                throw new MyException("User Defined!");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
class MyException extends Exception{  // you have to first make a class of your Exception and then extends it with the Original Exception
    // and store the value in constructor

    public MyException(String value){ // function with its parent name is called Constructor
        super(value);
    }
        }