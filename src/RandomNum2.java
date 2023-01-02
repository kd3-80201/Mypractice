import java.util.Random;
import java.util.Scanner;

public class RandomNum2 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter start value: ");
        int start = sc.nextInt();
        System.out.println("Enter End value: ");
        int end = sc.nextInt();
        int g = end - start;

        for (int u = 0; u < 10; u++) {
            int value = r.nextInt(g)+start;
            System.out.println(value);
        }

    }
}
