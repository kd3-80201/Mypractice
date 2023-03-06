public class New_Practice6 {
    public static void main(String[] args) {
        int[] p = {1,2,3,4,5,6,7,8,9};
        int target = 9;
        System.out.println(value(p,target));
    }
    static int value(int[] g,int target){
        int start = 0;
        int end = g.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (g[mid]> target){
                end = mid - 1;
            }
            else if (g[mid]< target){
                start = mid + 1;
            }
            else
                return mid;
        }
        return -1;
    }
}
