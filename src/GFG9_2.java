import java.util.Arrays;
// Right output, qsn 9 of Love Bubber Arrays
// Given an array arr[] denoting heights of N towers and a positive integer K, you have to modify the height of each tower either by increasing or decreasing them by K only once.
//Find out what could be the possible minimum difference of the height of shortest and longest towers after you have modified each tower.
//Note: Assume that height of the tower can be negative.
public class GFG9_2 {
    public static void main(String[] args) {

//        int[] arr = {1,5,8,10};
        int[] arr = {3, 9, 12, 16, 20};
//        int[] arr = {2, 6, 3, 4, 7, 2, 10, 3, 2, 1};
        int k = 3;
        System.out.println(welcome(arr,k));
    }
    static int welcome(int[] arr, int k){
        Arrays.sort(arr);
        int CurrMIn = (arr[arr.length-1]) - (arr[0]);

        int min,max;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - k < 0)continue;
            min = Math.min(arr[0]+k,arr[i]-k);
            max = Math.max(arr[i-1]+k,arr[arr.length-1]-k);
            CurrMIn = Math.min(CurrMIn,max-min);
        }

        return CurrMIn;

    }
}
