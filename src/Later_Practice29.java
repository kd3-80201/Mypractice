import java.util.Scanner;

public class Later_Practice29 {
    public static void main(String[] args) {
        // 0 1 1 2 3 5 8 13 21 34 55
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Nth number to find it's fibonacci");
        int num = sc.nextInt();
        int g = 0;
        int h = 1;
        int a = 2;
        System.out.print(0+" "+1+" ");
        while (a < num){
            int temp = h;
            h = h + g;
            g = temp;
            System.out.print(h+" ");
            a++;
        }
    }
}
