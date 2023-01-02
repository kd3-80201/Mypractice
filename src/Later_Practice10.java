import java.util.Scanner;

public class Later_Practice10 {
    public static void main(String[] args) {
        something();
        something();

    }
    static void something(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num");
        int t = sc.nextInt();
        for (int i = 0; i < 11; i++) {
            System.out.println(t+" * "+i+" = "+t*i);
        }
    }
}
