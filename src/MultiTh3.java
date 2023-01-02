class you implements Runnable{
    public void run(){
        for (int j = 0; j < 5; j++) {
            System.out.print("you");
            try {Thread.sleep(200);}catch (Exception ignored){}
        }
    }
}
class tube implements Runnable{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println(" tube");
            try {Thread.sleep(200);}catch (Exception ignored){}
        }
        System.out.println(" ");
    }
}
public class MultiTh3 {
    public static void main(String[] args) {
//        you y = new you();
//        tube t = new tube(); //

        Runnable r1 = new you();
        Runnable r2 = new tube();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        try {
            Thread.sleep(40);
        }catch (Exception ignored){}
        t2.start();
    }
}
