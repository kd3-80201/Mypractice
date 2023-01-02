class apple{
    int num;
    // public void count(){ // This will cause a problem while running the threads as we take the loop values to 2000
    // we want the num to be 2000 because the thread has to dng it one by one until both the loop breaks
    // but the problem occurs while t1 thread t2 thread gets there at same time [suppose t1 rn is num = 600 + 1]
    // at the same t2 get there and got the value of num only [not addition one] so now the value of t2 is [600 + 1] instead of
    // 601 + 1 this happens many times in the scheduler that's why even if the loops break we didn't get the output as 2000
    // num++;
    //}
    public synchronized void count(){ // To prevent threads to collide at same time we use synchronized method so if t1 is executing
        // count() t2 won't interrupt and vice versa
        //

        num++;
    }
}
public class MultiTh7 {
    public static void main(String[] args) throws Exception{
        apple  a = new apple();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                a.count();
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                a.count();
            }
        });
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("num "+a.num);
        System.out.println(t1.getName());
        System.out.println(t2.getName());
    }
}
