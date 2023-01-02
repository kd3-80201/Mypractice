class baig extends Thread{
   public void run(){ // only run function is applicable to the threads
        for (int i = 0; i < 5; i++) {
            System.out.println("Afnan Baig");
            try {Thread.sleep(500);} catch (Exception ignore) {}
        }
    }
}
class surname extends Thread{
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Mirza");
            try {Thread.sleep(500);} catch (Exception ignore) {}
        }
    }
}

public class MultiTh01 extends Thread{
    public static void main(String[] args) {
        baig b1 = new baig();
        surname s1 = new surname();
        b1.start();
        try {Thread.sleep(20);}catch (Exception e) {throw new RuntimeException(e);}
        // to keep at time delay of 20 milliseconds
        // so both the programme should display in time one by one (not collide and 1 goes to 2nd place)
        s1.start();
    }
}