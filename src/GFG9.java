import java.util.Arrays;
// Wrong output
public class GFG9 {
    public static void main(String[] args) {
        int[] arr = {1 ,5, 8, 10};
//        int[] arr = {2, 6, 3, 4, 7, 2, 10, 3, 2, 1};
        int k = 3;
        System.out.println(welcome(arr,k));
    }
    static int welcome(int[] arr,int k){
        int[] temp = new int[arr.length];
        for(int i = 0; i< arr.length; i++){
            temp[i] = arr[i] - k;
        }
        System.out.println(Arrays.toString(temp));
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int j : temp) {
            if (j > max) {
                max = j;
            }
            if (j < min && j > 0) {
                min = j;
            }
        }
        System.out.println("Maximum "+max+" "+"Minimum "+min+" "+"Sub is "+(max-min));
        return max-min;
// this one is not right when running on multiple test cases
    }
}
