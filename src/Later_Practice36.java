public class Later_Practice36 {
    public static void main(String[] args) {
        String g = "lflkfjldjflsnvj";
        char ch = 'n';
        find(g,ch);
        System.out.println(find(g,ch));
    }
    static boolean find(String b,char j){
        int ln = b.length();
        for (int i = 0; i < ln; i++) {
            if (b.charAt(i) == j){
                return true;
            }
        }
        return false;
    }
}
