import java.util.Scanner;

public class Later_Practice08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        switch (n){
            case "home" -> System.out.println("now");
            case "hospital" -> System.out.println("never");
            case "college" -> System.out.println("don't need to");
            default -> System.out.println("type something relevant Man !!!");
        }
    }
}
