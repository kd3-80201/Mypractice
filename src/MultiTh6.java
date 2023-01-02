public class MultiTh6 {
    public static void main(String[] args) throws InterruptedException {
      Thread t1 = new Thread(() ->
      {
          for (int i = 0; i < 5; i++) {
              System.out.println("show this to them");
              try {
                  Thread.sleep(200);

              }catch (Exception e) {throw new RuntimeException(e);}
          }
          },"first thread");

      Thread t2 = new Thread(() ->
      {
          for (int i = 0; i < 5; i++) {
              System.out.println("96");
              try {Thread.sleep(200);}catch (Exception e) {throw new RuntimeException(e);}
          }
      },"Second thread"); // we can name our threads for simplification

        Thread t3 = new Thread(() ->
      {
          for (int i = 0; i < 5; i++) {
              System.out.println("the one for enhancing "+ Thread.currentThread().getPriority()); // we can also find out priority, set name, get name etc...
              // within thread itself
              try {Thread.sleep(200);}catch (Exception e) {throw new RuntimeException(e);}
          }
      },"Third thread"); // we can name our threads for simplification

//        t1.setPriority(1);
//        t2.setPriority(8);

        t1.start();
        try {Thread.sleep(20);}catch (Exception e) {throw new RuntimeException(e);}
        t2.start();

        try {Thread.sleep(20);}catch (Exception e) {throw new RuntimeException(e);}
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(t1.isAlive());
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
    }
}
