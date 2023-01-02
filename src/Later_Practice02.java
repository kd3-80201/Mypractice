import java.util.Scanner;
// Revising code and theory from notebook 4 Nov 2022
public class Later_Practice02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value Enhanced method");
        int num = sc.nextInt();
        if (num < 1)
        {
            System.out.println("nor prime nor composite");
        }
        int count = 2;
        int k = 0;
        while (count * count < num){
            if (num % count == 0) {
                k = 1;
                break;
            }
            count++;
        }
        if (k == 1){
            System.out.println("it's not a prime number");
        }
        else {
            System.out.println("it's a prime number");
        }
    }
}
