public class oop4 {
        // Polymorphism
        // Many Forms(Behaviors)
        public void see(){
            System.out.println("Don't know which one is gonna print?");
        }
        // same name with different parameters is called MethodOverloading
        public void see(String s){
            System.out.println(s+" value is gonna print");
        }
    public static void main(String[] args) {
       oop4 op4 = new oop4();
       op4.see();
       op4.see("yes");
    }
}
//within class if there are multiple methods/function with same name but different parameter is called MethodOverloading