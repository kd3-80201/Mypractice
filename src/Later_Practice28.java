import java.util.Scanner;
//assignment04_3
public class Later_Practice28 {
    public static void main(String[] args) {
        int s,hcf,lcm;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first num");
        int a = sc.nextInt();
        System.out.println("Enter Second num");
        int b = sc.nextInt();
        int temp1  = a;
        int temp2  = b;
        while (temp2 != 0){
            s = temp2;
            temp2 = temp1 % temp2;
            temp1 = s;
        }
        hcf = temp1;
        lcm = (a * b)/ hcf;
        System.out.println("HCF would be "+hcf);
        System.out.println("LCM would be "+lcm);
    }
}
