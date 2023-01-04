
 import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHandling5 {
    // Exception Handling in java Throw and Throws
    public static void main(String[] args) // throws Exception

            // or individual Exceptions like IOException,SQLException,...
            //By using this [throws Exception] you won't get any Error it's kinda
             // suppressing[means to stop something by using force] the Error
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input value");
        try {
            int a = Integer.parseInt(br.readLine());
            int j = 10 + a;
            if (j < 15){
                throw new ArithmeticException(); //we are force fully throwing an Error [Using throw]
                // and what type of error we want to throw we wrote it
                // if the value of j is less than 15 it will throw an error
            }
        }catch (IOException e){
            System.out.println("something particularly");
        }
        catch (ArithmeticException ar){
            System.out.println("This value is less than 15"); // The thrown error will be shown using this line
        }

    }
}
