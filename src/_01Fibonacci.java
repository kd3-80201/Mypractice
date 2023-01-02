import java.util.Scanner;

public class _01Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(0+" "+1+" ");
        int num =3;
        while (num<=n){
            int temp = b;
            b = b + a;
            a = temp;
            //System.out.print(b+" ");
            num++;
        }
        System.out.print(b+" ");
    }
}
