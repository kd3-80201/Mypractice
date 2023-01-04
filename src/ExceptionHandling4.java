import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExceptionHandling4 {
    public static void main(String[] args) throws Exception {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            //This all is a enhanced way of try catch we don't need to write catch block, finally block [to close the resources]

            String g = br.readLine();
            System.out.println("Value is "+g);
        }
// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        try {
//            String g = br.readLine();
//
//        }catch (Exception e){System.out.println(e);}
//        finally {
//            System.out.println("something's going on");
//            br.close();
//        }
    }
}
