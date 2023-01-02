public class MultiTh4 {
    public static void main(String[] args) {
        Runnable r = () ->
        {
                for (int j = 0; j < 5; j++) {
                    System.out.print("you");
                    try {Thread.sleep(200);}catch (Exception ignored){}
                }
            };
        Runnable r2 = () ->
        {
                for (int j = 0; j < 5; j++) {
                    System.out.println(" tube");
                    try {Thread.sleep(200);}catch (Exception ignored){}
                }
            System.out.println(" ");
            };
        Thread t1 = new Thread(r);

        Thread t2 = new Thread(r2);

        t1.start();
        try {Thread.sleep(20);}catch (Exception ignored){}
        t2.start();
    }
}
