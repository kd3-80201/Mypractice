import java.util.Random;
import java.util.Scanner;
// This method is now resolve in the RandomNum4, you can read this code and look into it how it's resolved (I have used the functions)
public class RandomNum3 {
    public static void main(String[] args) {
        int k = 0;
String user = "YES";
        do {
            Random r = new Random();
            Scanner sc = new Scanner(System.in);

            int attempt = 9;
            System.out.println("""
                                    +++Number Guessing Game+++
                    Score will be generated according to the User's attempts out of 100\s
                    Condition:- You have to Guess the Random Number in 10 attempts\s""");

            System.out.println("Enter Range Starting From ");
            int start = sc.nextInt();
            System.out.println("Enter Range Until ");
            int end = sc.nextInt();
            if (start > end) {
                System.out.println("Input the values accordingly");
            }
            int value = end - start;
            int ch = r.nextInt(value) + start; // Calculate the range
//        System.out.println("Random Number is "+ch);
            boolean tr = false;
            while (attempt >= 0 && !tr) {
                System.out.println("Guess The Number ");
                int input = sc.nextInt();
                if (input == ch) {
                    System.out.println("Congratulations!!! You Have Guessed The Right Number In " + (10 - attempt) + " Attempts" +
                            "\nYou've Scored " + (attempt * 10) + " Out of 100");
                    tr = true;
                } else if (input > ch) {
                    System.out.println("Value Is Higher Than Generated Number");
                    System.out.println("Number of Attempt Left: " + attempt);
                    attempt--;
                } else {
                    System.out.println("Value Is Lower Than Generated Number");
                    System.out.println("Number of Attempt Left: " + attempt);
                    attempt--;

                }
//                if (k == 1){
//                    System.out.println("Play Again Yes/No");
//                    s = sc.next().toUpperCase();
//                    if (s.equals("NO")) {
//                        System.exit(0);
//                    } else {
////                        check();
//                        attempt = 10;
//                    }
//                }
            }
                System.out.println("Better Luck Next Time! The Generated Number was: " + ch);

        }while (user == "NO");
    }
}
