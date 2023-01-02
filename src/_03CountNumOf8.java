public class _03CountNumOf8 {
    public static void main(String[] args) {
        long n =787665165494654788L;

        int c = 0;
        while (n>0){
            long temp = n%10;

            if (temp == 4){
                c++;
            }
                n = n/10;
        }
        System.out.println(c);
    }
}
