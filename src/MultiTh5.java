public class MultiTh5 {
    public static void main(String[] args) throws Exception {
        Runnable r1 = () ->
        {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < i; j++){
                    System.out.print("*");
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {throw new RuntimeException(e);}
                }
                System.out.println(" ");
            }
        };
        Runnable r2 = () ->
        {
            for (int i = 10; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(" ");
            }
        };
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start(); // start method by default call run() method
        try {Thread.sleep(40);}catch (Exception ignored){}
        t2.start();

        t1.join();
        t2.join();  // these two join method will execute first and display output

        System.out.println(t1.isAlive());
        // it will throw boolean expression if the respected thread (t1,...) is alive at the moment or not
        // Basically the thread t1 is not live at the moment for it will display false
        System.out.println("Bye!");
        // Bye will print later or particularly at last of all the execution
        // this Bye is printed using main thread unless of above displayed output they are displayed individually by two
        // of the threads which are t1 & t2

    }
}
