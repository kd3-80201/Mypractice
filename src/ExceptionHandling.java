public class ExceptionHandling {
    public static void main(String[] args) {
        int i,j,k =0;
        i = 0;
        j = 102;
        try {
            k = j/i; // this one is the critical situation because what if the value of i = 0; and the 0 value can't be handled
            // without Exception because integer / 0 is infinity and there is no infinity in programming.
            // it will throw a java.lang.ArithmeticException
        }catch (Exception e){
            System.out.println("Exception is: "+e);
        }
        System.out.println("value  is :"+k);
    }

}
