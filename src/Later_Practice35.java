public class Later_Practice35 {
    // count the even number of digit's
    public static void main(String[] args) {
        int[] f = {5555, 901, 482, 1771};
        System.out.println(digit(f));
    }
    static int digit(int[] g) {
        int num = 0;
        if (even(g)) {
            num++;
        }
        return num;
    }
    static boolean even(int[] p) {
        int y = 0;
        for (int i = 0; i < p.length; i++) {
            int len = p[i]; //put the 0th index here
// here's the problem len variable is not getting any other array because it gets changed to at last value 0.
            while (len > 0){ // I
                // was trying to divide the index of array individually but,I think next array is not coming only the index of zero[0] is working
                y = y + 1;
                len = len/10;
            }
        }
        return y %2 == 0;
    }
}