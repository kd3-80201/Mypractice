public class New_Practice8 {
    //An element is called a peak element if its value is not smaller than the value of its adjacent elements(if they exists).
    //Given an array arr[] of size N, Return the index of any one of its peak elements.
    //Note: The generated output will always be 1 if the index that you return is correct. Otherwise output will be 0. 

    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,4,3,2,1};
//        int[] arr = {15};
        int[] arr =  {1,5,4,8,7,9,56,52,3};
//        int[] arr = {10,20,15,5,23,90};
        int length = arr.length;
        System.out.println(FindOut(arr,length));

        //
    }
    static int FindOut(int[] arr,int length){
        int start = 0;
        if (length==1){
            return 0; // putted 0 in return!!!!
        }
        int end = length - 1;

        while (start <= end){
            int mid = start+(end - start)/2;

            if (mid > 0 && mid < length-1){
                if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                    return mid;
                }
                else if (arr[mid - 1] > arr[mid]) {
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }
            else if (mid == 0) {
                if (arr[0]> arr[mid + 1]){
                    return 0;
                }
                else return 1;
            } else if (mid == end) {
                if (arr[end]> arr[end - 1]){
                    return end;
                }
                else return end-1;
            }
        }
        return 1;
    }
}
