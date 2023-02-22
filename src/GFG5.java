import java.util.Arrays;

public class GFG5 {
    public static void main(String[] args) {
//        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6 };
        int[] arr = {1,-1, 3, 2, -7, -5, 11, 6};
        int length = arr.length;
        Find(arr,length);
    }
    static void Find(int[] arr, int n){

       int[] temp = new int[arr.length];
       int j = 0;
        for (int i = 0; i <= arr.length-1; i++) {
            if (arr[i]>= 0){
           temp[j] = arr[i];
                j++;
            }
        }

        for (int g = 0; g <= arr.length-1; g++) {
            if (arr[g] < 0){
              temp[j] = arr[g];
                j++;
            }
        }
        for (int i = 0; i <= arr.length-1; i++) {
            arr[i] = temp[i];
        }
//        System.out.print(arr[i]+" ");
        System.out.print("Second value "+Arrays.toString(arr));
    }
}
