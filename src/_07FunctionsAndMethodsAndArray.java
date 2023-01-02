import java.util.Arrays;

// U should look into this programme because the problem is when ur assigning the values in static and how is going to show in arrays.ToString from above
// and using static int how r u going to return the array from static to the main
public class _07FunctionsAndMethodsAndArray {
    public static void main(String[] args) {
    int [] c = {4,5,6,7,5,47,4};
    something(c,2,4);
    System.out.println(Arrays.toString(c));
    }
//    static int something(int [] arr, int start, int end){
//        for (int i = start-1; i <end; i++) {
//            System.out.println(arr[i]);
//        }
//        //return something(arr[]);
//
//        return (arr[],start,end);
//    }

    static void something(int[] arr, int s, int e){
        for (int i = s-1; i <e; i++) {
            System.out.println(arr[i]);
        }
    }

}
