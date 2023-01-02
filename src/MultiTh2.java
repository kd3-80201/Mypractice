
public class MultiTh2 {
    public static void main(String[] args) {
//        see s = new see();
//        look l = new look(); // This can also be possible

        Runnable s = new see();
        Runnable l = new look();
        Thread t1 = new Thread(s);
        Thread t2 = new Thread(l);

//        s.start();
        t1.start();
        try {
            Thread.sleep(10);
        }catch (Exception ignore){}
        t2.start();
//        l.start(); //so we don't have start method in runnable
    }
}
class see implements Runnable{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("see There!");
            try {
                Thread.sleep(120);
            }catch (Exception ignore){}
        }
    }
}

class look implements Runnable{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("look There!");
            try {
                Thread.sleep(120);}catch (Exception ignore){}
        }
    }
}