public class Later_Practice37 {
    //check it again it's has an error while running

    public static void main(String[] args) {
        int[] arr ={ 3,4,5,6,7,8,9,10,11,12,13,14,15};
        int target = 12;

        System.out.println(find(arr,target));
        }
        static int find(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
            if (target< 0){
                return 0;
            }


            while (start <= end){
                int mid =  start + (end - start)/2;

                if (target> arr[mid]){
                    start = mid+1;
                }
                if (target< arr[mid]){
                    end = mid - 1;

                }
                else{
                    return mid;
                }

            }
            return -1;
        }
}
