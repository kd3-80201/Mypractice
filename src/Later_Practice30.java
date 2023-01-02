import java.util.Scanner;

public class Later_Practice30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st");
        int some = sc.nextInt();
        findArmstrong(some);
        System.out.println("Enter 2nd");
        int AnotherSome = sc.nextInt();
        findArmstrong(AnotherSome);

//        System.out.println("1ST num");
//        int a = sc.nextInt();
//        int j = a;
//        int c = 0;
//        while(a != 0){
//            int temp = a % 10;
//            c = c + temp * temp * temp;
//            a = a/10;
//        }
//        if (c == j){
//            System.out.println("It's a palindrome");
//        }
//        else {
//            System.out.println("it's not palindrome");
//        }
//        System.out.println("2ND num");
//        int b = sc.nextInt();
//        int y = b;
//        int g = 0;
//        while (b != 0){
//            int temp2 = b % 10;
//            g = g + temp2 * temp2 * temp2;
//            b = b / 10;
//        }
//        if (g == y) {
//            System.out.println("this num is a palindrome num");
//        }
//        else
//            System.out.println("it's not a palindrome");
//    }

    }
    static void findArmstrong(int a){
        int j = a;
        int c = 0;
        while (a != 0) {
            int temp = a % 10;
            c = c + temp * temp * temp;
            a = a / 10;
        }
        if (c == j) {
            System.out.println("It's a Armstrong");
        } else {
            System.out.println("it's not Armstrong");
        }
    }
}