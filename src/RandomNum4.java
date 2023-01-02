import java.util.Random;
import java.util.Scanner;

public class RandomNum4 {
    public static void main(String[] args) {
        bye();
    }
    static void bye(){
        Random r = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.println("""
                                    +++Number Guessing Game+++
                    Score will be generated according to the User's attempts out of 100\s
                    Condition:- You have to Guess the Random Number in 10 attempts\s""");

        System.out.println("Enter Range Starting From ");
        int start = sc.nextInt();

        System.out.println("Enter Range Until ");
        int end = sc.nextInt();

        if (start > end) {
            System.out.println("Input the values accordingly"); // If the user entered the starting range higher than it's ending range
        }

        int value = end - start;
        int ch = r.nextInt(value) + start; // Formula to calculate the range From and To
        values(ch);
    }
    static void values(int ch){
        Scanner sc = new Scanner(System.in);
        int attempt = 9;
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
                if (tr) {
//                    System.out.println("Play Again!? By Typing:[Yes/No]");
                    System.out.println("Do you wish to play again? Type: [Yes/No]");
                    String s = sc.next().toUpperCase();
                    if (s.equals("YES")) {
                        bye();
                    } else {
                        System.exit(0);
                    }
                }
        }
        System.out.println("Better Luck Next Time! The Generated Number was: " + ch);
    }
}
