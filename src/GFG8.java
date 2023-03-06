public class GFG8 {
    public static void main(String[] args) {
//        int[] arr =  {1,2,3,-2,5};
        int[] arr =  {-1,-2,-3,-4};
      int max = Integer.MIN_VALUE;
      // I have putted 0 here(before) and that causes the difference when the maximum value in negative,
        // but I took the maximum value by default as 0 so whatever negative value be there, there's always 0
      int current = 0;
        for (int i = 0; i < arr.length; i++) {
            current = current + arr[i];
            if (current > max){
                max = current;
            }
            if (current < 0){
                current = 0;
            }
        }
        System.out.println("value is :"+max);
    }
}
