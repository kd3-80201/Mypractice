import java.util.Scanner;
// assignment04_2.java
public class Later_Practice27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lcm, i;
        System.out.println("1St");
        int a = sc.nextInt();
        System.out.println("2nd");
        int b = sc.nextInt();
        int l = Math.max(a, b);
        for (i = l; i < a * b; i+=l) {
            if (i % a == 0 && i % b == 0) {
                break;
            }
        }
        lcm = i;
        System.out.println(lcm);
    }
}

