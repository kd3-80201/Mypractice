import java.util.Arrays;
// Given an array, rotate the array by one position in clock-wise direction.
// love bubber arrays 7th
public class GFG7 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] hell = new int[arr.length];

        hell[0] = arr[arr.length-1];
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            hell[i] = arr[j];
            j++;
        }
        System.out.println(Arrays.toString(hell));

        System.arraycopy(hell, 0, arr, 0, arr.length);
        System.out.println("Arrays value"+Arrays.toString(arr));

    }
}
