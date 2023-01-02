public class _02Reverse {
    public static void main(String[] args) {
        int n = 1598712;
        int ra =0;
        while (n>0){
            int b = n%10;
            ra = ra*10+b;
            n = n/10;
        }
        System.out.println(ra);
    }
}
