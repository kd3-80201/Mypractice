class sam implements Cloneable{
    int i;
    int j;
    @Override
    public sam clone() throws CloneNotSupportedException  {
        return (sam) super.clone();
    }
}

public class oop6_1 {
    public static void main(String[] args) throws CloneNotSupportedException{
sam obj = new sam();
obj.i = 5;
obj.j = 78;

sam second = (sam) obj.clone();

second.i = 90;
second.j = 50;
System.out.println(obj.i+" "+ obj.j);

        System.out.println(second.i+" "+ second.j);
    }
}
