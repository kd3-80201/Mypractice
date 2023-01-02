import java.util.Scanner;

public class Later_Practice09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        System.out.println(something(a));
        int kuch = subtraction();
        System.out.println(kuch);
    }
    static double something(int g){
        return (int) Math.sqrt(g);
    }
    static int subtraction(){
        Scanner sc = new Scanner(System.in);

        int ac = sc.nextInt();
        int bc = sc.nextInt();
        return ac - bc;
    }

}

