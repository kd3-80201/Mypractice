import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ExceptionHandling3 {
    public static void main(String[] args) {
        int a =0,i=10,k=5;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Scanner sc = new Scanner(System.in);
        try {
            a = Integer.parseInt(br.readLine());
            int c = i + k / a;
            System.out.println("output "+c);

        }catch (IOException e){
            System.out.println("This exception is "+e);
        } catch (Exception ae){
            System.out.println("Unknown exception "+ae); //btw it NumberFormatException
        }
        finally {
            try {
                br.close();} catch (IOException e) {throw new RuntimeException(e);}
            // in finally block you must close the resources you are using

            System.out.println("Bye!"); // Exception occurs or not this finally block will print the input at last
        }
    }
}
