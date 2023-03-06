public class GFG10 {

    public static void main(String[] args) {
//        int[] arr = {1, 4, 3, 2, 6, 7};
//        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int[] arr = {2,1,0,3};
        System.out.println(minJumps(arr));
    }
    static int minJumps(int[] arr){

        if (arr[0] == 0){
            return -1;
        }
        else if( arr.length == 1) {
            return -1;
        }
       int jump = 0;
        int pos = 0;
        int des = 0;
        int i;
        for (i = 0; i < arr.length ; i++) {
            des = Math.max(des,i + arr[i]);
            if (pos == i){
                pos = des;
                jump++;
            }
            if (des == i){
                return -1;
            }
        }
        return jump;
    }
}