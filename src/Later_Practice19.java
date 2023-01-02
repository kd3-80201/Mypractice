import java.util.Arrays;
import java.util.Scanner;

public class Later_Practice19 {
    public static void main(String[] args) {
        int[][] kj = new int[5][5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                kj[i][j] = sc.nextInt();

            }
        }
        for (int n = 0; n < 5; n++) {
            for (int h = 0; h < 5; h++) {
                System.out.println(kj[n][h]);
            }
        }
        int t = kj.length - 1;
        for (int[] ints : kj) {
            System.out.println(Arrays.toString(ints));
            //Out will be like this if i put Arrays.toString in the loop because it only shows us the first array that's y i took it into loop
            //[1, 2, 3, 4, 5]
            //[6, 12, 23, 65, 95]
            //[45, 85, 21, 62, 49]
            //[74, 563, 265, 21, 20]
            //[2, 32, 21, 23, 26]
        }
    }
}
