public class ExceptionHandling2 {
    public static void main(String[] args) {
        int[] ap = new int[5];
        try {

            for (int i = 0; i <= 5; i++) {
                ap[i] = i;
            }
        }catch (ArrayIndexOutOfBoundsException ab){
            System.out.println("value of ab is: "+ab);
        }
        for(int a : ap){
            System.out.println("value of J is "+a );
        }
    }
}
