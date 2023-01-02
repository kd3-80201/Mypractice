import java.util.Scanner;

public class Later_Practice17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(armstrong(a));
    }
    static boolean armstrong(int a){
        if (a < 0){
            return false;
        }
        int h = 2;
        while (h * h < a){
            if (a % h == 0){
                return false;
            }
            h = h + 1;
        }
        return h * h > a;
    }
}
