import java.util.ArrayList;
import java.util.Arrays;
// Wrong output
public class GFG9_1 {
    public static void main(String[] args) {
//        int[] arr = {1,5,8,10};
        int[] arr = {3, 9, 12, 16, 20};
//        int[] arr = {2, 6, 3, 4, 7, 2, 10, 3, 2, 1};
        int k = 3;
        System.out.println(welcome(arr,k));
    }
    static int welcome(int[] arr,int k){
        Arrays.sort(arr);

        if (arr.length == 1){
            return arr[0];
        }
        ArrayList <Integer> g = new ArrayList<>();

        for (int value : arr) {
            if (value >= 0) {
                g.add(value);
            }
        }
            System.out.println("Arrays list is " + g);
//        if (g.isEmpty()){
//            return arr[arr.length-1] - arr[0];
//        }
            int MinArr = g.get(0)+k;

            int MaxArr = g.get(g.size() - 1)-k;

        System.out.println("Minimum value is " + MinArr);
        System.out.println("Maximum value is " + MaxArr);


        return  MaxArr - MinArr;

//        ArrayList<Integer> second = new ArrayList<>();
//        for (int i : arr) {
//            second.add(i + k);
//        }
//        int nowVal2 = (second.get(second.size()-1))-second.get(0);
//
//
//        return Math.min(nowVal,nowVal2);
    }
}
