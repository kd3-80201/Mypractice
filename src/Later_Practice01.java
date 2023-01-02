import java.util.Scanner;
// Revising code and theory from notebook 2022/11/4
public class Later_Practice01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(Math.max(a,Math.max(b,c)));
    }
}
