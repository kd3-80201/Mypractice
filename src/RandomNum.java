import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i = 1; i <=10; i++) {
            int d = r.nextInt(3)+5;
//            int d = r.nextInt(350)+250;
//            if (d %5==0){
//                System.out.println("count:"+ i+ " is " +d);
//            }
            System.out.println("count:"+ i+ " is " +d);
        }


    }
}
