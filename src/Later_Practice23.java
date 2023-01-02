import java.util.ArrayList;
import java.util.Scanner;
// ArrayExample05.Java
public class Later_Practice23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList < ArrayList <Integer>> ty = new ArrayList<>(); // it's like an array of array But in the form of ArrayList
        for (int i = 0; i < 3; i++) {
            ty.add(new ArrayList<>());
        }
        for (int d = 0; d < 3; d++) {
            for (int s = 0; s < 3; s++) {
                ty.get(d).add(sc.nextInt());
            }

        }
        System.out.println(ty);
    }
}
