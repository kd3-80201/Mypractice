// in this example while we are working on multi threading now I got the point when u execute this programme it will
// show the programme as executing one by one first {hi class} will be displayed 5 times and then {hello class}
// will be displayed
// Now with the use of multithreading we can execute both parallel
public class MultiTh {
    public static void main(String[] args) {
        System.out.println("something");
        hi obj1 = new hi();
        hello obj2 = new hello();
        obj1.show();
        obj2.show();
    }
}

class hi{
    void show(){
        for (int i = 0; i < 5; i++) {
            System.out.println("hi is shown to you");
            try {
                Thread.sleep(1000);
            }catch (Exception ignored){}
        }
    }
}
class hello{
    void show(){
        for (int i = 0; i < 5; i++) {
            System.out.println("hello is shown to you");
            try {
                Thread.sleep(2000);
            }catch (Exception ignored){}
        }
    }
}