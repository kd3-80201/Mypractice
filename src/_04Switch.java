import java.util.Scanner;

public class _04Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String hi = sc.next();
//        switch (hi){
//            case "mango" -> System.out.println("it is a king of fruits");
//            case "grapes" -> System.out.println("bunch of fruits");
//            default -> System.out.println("Nothing else");
//        }
        switch (hi){
            case "xerox":
                System.out.println("prints the letter to blank paper");
                break;
            case "Tutorials":
                System.out.println("YouTube");
                break;
            default:
                System.out.println("you have typed the wrong option");
                break;
        }
    }
}
