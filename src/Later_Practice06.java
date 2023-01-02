import java.util.Scanner;
public class Later_Practice06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long num = sc.nextLong();
        int i = 0;
        while (num != 0){
            long g = num % 10;
            if (g == 5){
                i = i+1;
            }
            num = num/10;
        }
        System.out.println("Number of 5's in the qsn is "+i);
    }
}
