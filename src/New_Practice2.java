import java.io.Serializable;
import java.util.Stack;
// this was made up question, we can now find out the index value wherever they are
public class New_Practice2 {
    public static void main(String[] args) {
        int[] n = {1,8,8,4,9,5,4,2,1,85};
        int target = 4;
        System.out.println(find(n,target));
    }
    static Serializable find(int[] a, int target ){
        int len = a.length - 1;
        Stack<Integer> j = new Stack<>();
        for (int z = 0; z < len; z++) {
            if (a[z] == target) {
                    j.push(z);
            }
        }
        return j;
    }
}