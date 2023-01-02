import java.util.Arrays;

public class Later_Practice20 {
    public static void main(String[] args) {
        int[][] kj = {{1,2,3,5},{45,56,23},{98,65,67,10,30}};
        for (int i = 0; i < kj.length; i++) {
            for (int j = 0; j < kj[i].length; j++) {
                System.out.print(kj[i][j]+" ");
            }
        }

        for (int[] ints : kj) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
        }
        for (int[] g : kj){
            System.out.println(Arrays.toString(g));
        }
    }
}
