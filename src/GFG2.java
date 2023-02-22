import java.util.Arrays;
// Using Bubble Sort
public class GFG2 {
    public static void main(String[] args) {
        int[] arr = {1,55,4,5,6};
        int k = 3;
        int n = arr.length;
        Arrays.sort(arr);
//        System.out.println(arr[k]);
        System.out.println(KthSmallest(arr,0,n-1,k));


    }
    static int KthSmallest(int[] arr,int l,int r,int k){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]> arr[j + 1]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                }

            }

        }
return arr[k-1];
    }
}
