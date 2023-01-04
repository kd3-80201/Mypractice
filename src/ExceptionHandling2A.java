public class ExceptionHandling2A {
    public static void main(String[] args) {
        int i,j,k =0;
        int[] a = new int[4];
        i = 2;
        j = 102;
        try {
            k = j/i;  // this one is the critical situation because what if the value of i = 0; and the 0 value can't be handled
                      // without Exception because integer / 0 is infinity and there is no infinity in programming.
                      // it will throw a java.lang.ArithmeticException
            System.out.println(k);

            for (int c = 0; c <= 5; c++) {
                a[c] = c + 1;
            }
            for (int d: a) {
                System.out.println("Value of array is"+d);
            }
        }catch (ArithmeticException e){System.out.println("Exception is: "+e);}

        catch (ArrayIndexOutOfBoundsException af){System.out.println("Maximum value of array is 4");}
        // Multiple catch can be possible in the single try block

        catch (Exception e){
                // if you put this catch exception above all catch, it will cause problem because when you
                // put Exception at first it will handle all the Exceptions in the problem and there will be no use of individual Exceptions
                // that you wrote, so put this Exception at last so any other Exceptions do not get interrupted
            System.out.println("If there's unknown exception");
        }
    }
}
