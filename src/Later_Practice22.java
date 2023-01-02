import java.util.ArrayList;
import java.util.Scanner;

public class Later_Practice22 {
    public static void main(String[] args) {
//        gh.add(10);
//        gh.add(102);
//        gh.add(103);
//        gh.add(104);
//        gh.add(105);
//        gh.add(106);
//        System.out.println("First Change"+gh);
//        gh.set(3, 52);
//        System.out.println("Second Change"+gh);
//        gh.remove(3);
//        gh.set(2, 104);
//        System.out.println("Third Change"+gh);
//        gh.add(209);
//        System.out.println("Fourth Change"+gh);
        green();
        greene();
    }
    static void green(){
        Scanner sc = new Scanner(System.in);
        ArrayList <String> gh = new ArrayList<>();
        String d;
        for (int i = 0; i < 4; i++) {
            System.out.println("Input String");
            d = sc.next();
            gh.add(d);
        }
        System.out.println(gh);
    }
    static void greene(){
        int k;
        Scanner sc = new Scanner(System.in);
        ArrayList <Integer> jk = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            System.out.println("Input Integer");
            k = sc.nextInt();
            jk.add(k);
        }
        System.out.println(jk);
    }

}
