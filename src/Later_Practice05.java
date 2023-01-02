import java.util.Scanner;

public class Later_Practice05 {
    public static void main(String[] args) {
//        0 1 1 2 3 5 8 13 21 34 55
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print(0+" ");
        int a = 0;
        int b = 1;
        int count = 2;
        while (count <= num) {
            int temp = b;
            b = b + a;
            a = temp;
            System.out.print(a+" ");
            count++;
        }
       // System.out.print(a);
    }
}
