class BaigF {
    // An example of inheritance
    public void subtraction(int val1, int val2){
        int val3 = val1 - val2;
        System.out.println(val3);
    }
}
class Mirza extends BaigF {
    public void addition(int value, int val)  {
        int add = value+val;
        System.out.println(add);
    }
}
public class oop3 {
    public static void main(String[] args) {
        Mirza m = new Mirza();
        m.addition(15,26);
        m.subtraction(100,40);
    }
}
