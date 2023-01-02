import java.util.Arrays;
import java.util.Stack;

public class Later_Practice25 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,20};
        System.out.println(Arrays.toString(hellNO(arr)));
        //System.out.println(Arrays.toString(snap(arr)));

    }
    static int[] hellNO(int[] a){
        int start = 0;
        int len = a.length - 1;
        while (start < len){
        swap(a, start, len);
            start++;
            len--;
        }
        return a;
    }
    static void swap(int [] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    static Object[] snap(int[] hi) {
        Stack <Integer> q = new Stack<>();
        int ln = hi.length-1;
        for (int g = ln; g >= 0; g--) {
             q.push(hi[g]);
        }
        return q.toArray();
    }
    }
