public class Later_Practice13 {
    //Shadowing
    static int x = 90;
    static String h = "Afnan";
    public static void main(String[] args) {
        String
                h = "Nada";
        System.out.println(h);
        System.out.println(x);
        int x = 40;
        System.out.println(x);
        func();
        good();
    }
    static void func(){
        System.out.println(x);
    }
    static void good(){
        System.out.println(h);
    }
}
