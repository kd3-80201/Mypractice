import java.util.Arrays;

public class Later_Practice32 {
    public static void main(String[] args) {
        int[][] a = {{1,2,0,3,5,4,6,9},
                    {78,89,65,64},
                
                    {25,24,26,268,485,410}};
        int target = 24;
        int[] ans = hell(a,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] hell(int[][] g, int target){
        for (int t = 0; t < g.length; t++) {
            for (int k = 0; k < g[t].length; k++) {
                if (g[t][k] == target){
                    return new int[]{t,k};
                }

            }

        }
        return new int[]{-1,-1};
    }
}
