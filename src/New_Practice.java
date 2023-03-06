import java.util.Arrays;

public class New_Practice{
    public static void main(String[] args) {

        int[] p = {1, 2, 5, 6, 8, 7, 4, 8, 1, 10};
        getItReverse(p);
    }
    static void getItReverse(int[] x) {
        int start = 0;
        int end = x.length - 1;
        while (start <= end) {
            swap(x, start, end);
            start++;
            end--;
        }
//        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(x));
    }
    static void swap(int[] ar,int start,int end){
         int temp = ar[start];
         ar[start] = ar[end];
         ar[end] = temp;
    }
}