import java.util.Arrays;

//Given two arrays a[] and b[] of size n and m respectively. The task is to find the number of elements in the union between these two arrays.
//
//Union of the two arrays can be defined as the set containing distinct elements from both the arrays. If there are repetitions, then only one occurrence of element should be printed in the union.
//
//Note : Elements are not necessarily distinct.
public class GFG6 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        int[] b = {4,6,5,8,9};

        Arrays.parallelSort(a);
        Arrays.parallelSort(b);
        int val = 0;
        for (int k : a) {
            for (int i : b) {
                if (k == i) {
                    val = val + 1;
                }
            }
        }
        System.out.println("Value is :"+val);

        int sumUp = a.length + b.length - val;
        System.out.println("sumUp"+sumUp);

//        int max = Math.max(a.length,b.length);
//        int count = max - val;
//        System.out.println("count value"+count);


    }
}
