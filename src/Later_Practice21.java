import java.util.Arrays;

public class Later_Practice21 {
    public static void main(String[] args) {
        //Nothing();
        int[][] y = {{154,562,12,3,6},{896,563,452,125,234,745,896}};
        int[][] ans = green(y);
        System.out.println(Arrays.deepToString(ans));
        green(ans);

    }
//    static void Nothing(){
//        int[][] y = {{154,562,12,3,6},{896,563,452,125,234,745,896}};
//        for (int i = 0; i < y.length; i++) {
//            for (int o = 0; o < y[i].length; o++) {
//                System.out.print(y[i][o]+" ");
//            }
//        }
//        System.out.println("\n\t\t\t Gap");
//        for (int[] ints : y) {
//            for (int anInt : ints) {
//                System.out.print(anInt + " ");
//            }
//        }
////        green(Arrays.toString(t));
//    }
    static int[][] green(int[][] y){
//        for (int i = 0; i < y.length; i++) {
//            for (int o = 0; o < y[i].length; o++) {
//                System.out.print(y[i][o]+" ");
//            }
//        }
        System.out.println("Gap");
        for (int[] ints : y) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
        }

        return y;
    }
}
