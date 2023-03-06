public class New_Practice5 {
    public static void main(String[] args) {
        int[] g = {1,1,2,5,4,8,7,9,5,5,44};
        int n = g.length;
        System.out.println(PeakReverse(g,n));
    }
    static int PeakReverse(int[] arr, int len) {
        int start = 0;
        int end = len - 1;
        int mid = start + (end - start) / 2; // to find mid

        if (arr[mid] > arr[0] && arr[mid] > arr[end]) {
            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) {
                return mid;
            } else if (arr[mid - 1] > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        } else if (mid == 0) {
            if (arr[0] > arr[1]) {
                return 0;
            } else
                return 1;
        } else if (mid == end - 1) {
            if (arr[end - 1] > arr[end - 2]) {
                return end - 1;
            } else {
                return end - 2;
            }
        }
        return start;
    }
}
