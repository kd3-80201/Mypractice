import java.util.Scanner;

public class Later_Practice26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int HCF = 0;
        for (int j = 1; j <= num1; j++) {
            if (num1 % j == 0 && num2 % j == 0){
                HCF = j;
            }
        }
        System.out.println("HCF will be "+HCF);
    }
}
