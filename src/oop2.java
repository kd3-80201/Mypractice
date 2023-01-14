class tree{
    //Encapsulation
   private int google;

   public void setGoogle(int gi){
       // yeah, we can't have the values from another class when the variable is private,
       // but we can do is make a public function and call this public function from another class, and we can get the values
       // as the rules we can't call the private variables from another class, but we can call them within class or class function
       // as we did in this example we are getting the value of gi from another class and defining it in the private variable

       google = gi;
       System.out.println("The value is: "+google);
    }
    public int getTheValue(){
       // we can extract out the private values using return keyword, so we can use it there to further use
       // like printing, addition, etc...
        // it means we can print the private variable from another class
       return google;
    }
}
public class oop2 {
    public static void main(String[] args) {
        tree t = new tree();
        t.setGoogle(15);
        System.out.println(t.getTheValue());
    }
}
