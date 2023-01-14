class color{
    //Polymorphism
    //Method Overriding
    public void yellow(){
        System.out.println("Yellow,Black,White");
    }
}
class start extends color{
    public void yellow(){
        System.out.println("This text is going to display!");
        //reason of this print message is going to display you is because both the classes have same method called yellow
        // but the objects own(means s is object and main class is start)
        // class method is going to display when it comes to compare between two identical Methods
    }
}
public class oop4_1 {
    public static void main(String[] args) {
        start s = new start();
        s.yellow();
    }
}
