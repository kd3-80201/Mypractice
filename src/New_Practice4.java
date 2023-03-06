public class New_Practice4 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 12};
        int n = arr.length;
//        find(arr,n);
        System.out.println(find(arr,n));
    }
    static int find(int[] arr,int n){
        int temp = 0;
        for(int i = 1; i < n; i++){
            if (arr[i]> arr[temp]){
                temp = arr[i];

            }
        }
        return temp;
    }

}
