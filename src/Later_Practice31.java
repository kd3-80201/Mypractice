public class Later_Practice31 {
    public static void main(String[] args) {
        int[] u = {10,20,30,50,40,80,90};
        int tr = 8;

        System.out.println(find(u,tr));
    }
    static int find(int[] am, int target){
//        int len = am.length - 1;
//        int q = 0;
//        while (q < len){
//            if (am[q] == target){
//                return q;
//            }
//            q++;
//        }
        for (int n : am){
            if (n == target){
                return n;
            }
        }
    return -1;
    }

}
