public class Later_Practice24 {
    public static void main(String[] args) {
    int[] p = {90,15,20,23,60,52,21,20,70};
    int s1 = 2;
    int s2 = 6;
        System.out.println(max(p,s1,s2));
    }
    static int max(int[] b,int l1, int l2){
        int max = b[l1];
        for (int i = l1; i <= l2; i++) {
            if (b[i] > max){
                max = b[i];
            }
        }
        return max;
    }

}
