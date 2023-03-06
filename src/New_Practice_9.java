public class New_Practice_9 {
    // enhance way of New_Practice8
    public static void main(String[] args) {
int[] arr = {2,1,13};
int length = arr.length;
        System.out.println(enhance(arr,length));
    }
    static int enhance(int[] arr, int n){
        if (n ==1){
            return 0;
        }
        int start = 0;
        int end = n - 1;
        while(start<= n){
            int mid = start+(end - start)/2;
            if ((mid==0 || arr[mid]>= arr[mid-1]) && (mid == n - 1 || arr[mid]>= arr[mid+1] )){
                return mid;
            }
            else if (mid > 0 && arr[mid-1]> arr[mid]){
                end = mid - 1;
            }
            else start = mid + 1;
        }
        return 0;
    }
}



