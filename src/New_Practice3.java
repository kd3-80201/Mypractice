public class New_Practice3 {
    public static void main(String[] args) {
        String s = "Geeks";
        System.out.println(reverse(s));
    }
    static String reverse(String a){

        int len = a.length()- 1;
        String add = "";
        for (int i = len; i >=0 ; i--) {
            add = add + a.charAt(i);
        }
        return add;
    }
}
