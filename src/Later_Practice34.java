public class Later_Practice34 {
    public static void main(String[] args) {
int[][] arr = {{12,236,98,24,201,10},
              {7795,4,12,5,63,2,6352,45,1},
              {45,2,1,3,6,9,85,2,1,4,7,4,1,514,122}};
        System.out.println(biggest(arr));
    }
    static int biggest(int[][] arr){
        int max = arr[0][0];
        for (int k = 0; k < arr.length - 1; k++) {
            for (int l = 0; l < arr[k].length; l++) {
                if (arr[k][l] > max){
                    max = arr[k][l];
                }
            }
        }
        return max;
    }
}
