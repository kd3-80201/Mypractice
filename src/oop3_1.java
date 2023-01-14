class child {
    // this one is the example of multiple inheritance as u can observe what if child1 and child2 has same method call then what happens
    // which one should main class call first ??, this issue is called ambiguity, and to prevent that from occurring Java has removed
    // MULTIPLE INHERITANCE!!!
    public void some(){
        System.out.println("This will print some");
    }
}
class child2{
    public void some(){
        System.out.println("this will print thing");
    }
}
//public class oop3_1 extends child,child2{  // class cannot extend multiple classes
//    public static void main(String[] args) {
//      oop3_1 o = new oop3_1();
//      o.some();
//      o.some();
//    }
//}
