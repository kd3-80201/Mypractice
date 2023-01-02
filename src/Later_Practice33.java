public class Later_Practice33 {
    public static void main(String[] args) {
        String example = "Afnan Baig";
        char c = 'n';

        System.out.println(findIF(example,c));
    }
    static boolean findIF(String s, char target){
        int t = s.length();
        if (t < 1){
            return false;
        }
        for (int h = 0; h < t; h++) {
            if (s.charAt(h) == target){
                return true;
            }
        }
        return false;
    }
}
