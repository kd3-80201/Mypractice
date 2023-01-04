import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHandling6 {
    public static void main(String[] args) throws IOException // for finally block
    {
        BufferedReader br = null ;
        try {
            br = new BufferedReader(new InputStreamReader(System.in));
            int i = Integer.parseInt(br.readLine());
            if (i < 70){
                throw new ArithmeticException("an error");
            }
        }catch (ArithmeticException | IOException |NumberFormatException e){
            // if there's any ArithmeticException in this programme it will print the [an error] message
            // suppose value of i is less than 70

            System.out.println("the exception is "+e);
        }
        finally {
            br.close();
        }
    }
}
