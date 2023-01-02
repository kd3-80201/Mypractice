public class Later_Practice16 {
    public static void main(String[] args) {
        int ans = sum (48,92);
        int ghi = sum (25,48,92);
        System.out.println(ans);
        System.out.println(ghi);
    }
    static int sum(int a, int b){
        return a+b;
    }
    static int sum( int x,int y,int c){
        return x+y+c;
    }
    static int sum(){
        return 0;
    }
}
