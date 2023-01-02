import java.util.Arrays;

public class Later_Practice25A {
    public static void main(String[] args) {
        int[] j = {41,98,5,2,3,6,4,1,2,6,6,88,5,15,10};
        System.out.println(Arrays.toString(yeah(j)));
    }
    static int[] yeah(int[] no){
        int start = 0 ;
        int end = no.length  - 1;
        while (start < end){
            swap(no,start, end);
            start++;
            end--;
        }
        return no;
    }
    static void swap(int[] fg, int st, int en){
        int temp = fg[st];
        fg[st] = fg[en];
        fg[en] = temp;
    }
}
