import java.util.Arrays;

public class Later_Practice18 {
    public static void main(String[] args) {
        int[] b = {10, 20, 30, 50};
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+" "); // 10 20 30 50
        }
        for(int g : b){
            System.out.print(g + " "); // 10 20 30 50
        }
        System.out.println(Arrays.toString(b));  //Output will be [10, 20, 30, 50]
    }
}

