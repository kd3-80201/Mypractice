
class  queue{
    int num;
    boolean valueSet = false;
    public synchronized void put(int num){
        while (valueSet){
            try {
                wait();}catch (Exception ignored){}
        }
        System.out.println("Put : "+ num);
        this.num = num;
        valueSet = true;
        notify();
    }
    public synchronized void get(){
        while (!valueSet){
            try {wait();}catch (Exception ignored){}
        }
        System.out.println("Get : "+num);
        valueSet = false;
        notify();
    }
}
class producer implements Runnable{
    queue q;
    public producer(queue q){
        this.q = q;
        Thread t = new Thread(this,"Producer");
        t.start();
    }
    public void run(){
        int i = 0;
        while (true){
            q.put(i++);
            try {
                Thread.sleep(1000);} catch (Exception e){}
        }
    }
}

class Consumer implements Runnable{
    queue q;
    public Consumer(queue q){
        this.q = q;
        Thread t = new Thread(this,"Consumer");
        t.start();
    }
    public void run(){
        while (true){
            q.get();
            try {
                Thread.sleep(1000);}catch (Exception e){}
        }
    }
}
public class MultiTh8 {
    public static void main(String[] args) {
        queue q = new queue();
        new producer(q);
        new Consumer(q);
    }
}
