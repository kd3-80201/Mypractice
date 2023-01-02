import java.util.Scanner;

public class Later_Practice07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        switch (s) {
            case "mango" -> System.out.println("King of fruits");
            case "grapes" -> System.out.println("Green is color");
            default -> System.out.println("you have type irrelevant thing");
        }
    }
}
