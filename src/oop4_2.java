public class oop4_2 {// Constructor overloading
    //constructor with same name but different parameters is called constructor overloading
    // Constructor never return anything
    public oop4_2(){ // you can't add the methods in the constructor because constructor is itself a method!!!
            System.out.println("Simply print the output");
        }
      public oop4_2(int a){ // don't need to write public before constructor(or any), by default it can take it
        System.out.println("The inputted integer is "+a);
    }
    public static void main(String[] args) {
oop4_2 t = new oop4_2();
oop4_2 t1 = new oop4_2(85);
    }
}
