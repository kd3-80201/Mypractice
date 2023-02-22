import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GFG6_1 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {3,4,5,6,6,7};

        int[] z = new int[a.length+b.length];
        System.arraycopy(a,0,z,0,a.length);  // use to copy the array
        System.arraycopy(b,0,z,a.length,b.length);
        System.out.println(Arrays.toString(z));

        Set<Integer> set = new HashSet<>();


        for (int j : z) {
            set.add(j);
        }
        System.out.println("sorted value is: "+set);


        for (int j : z) {
            if (!set.contains(j)) {
                set.add(j);
            }
        }
        int ab = set.size();
        System.out.println("sorted value is: "+ab);
    }
}