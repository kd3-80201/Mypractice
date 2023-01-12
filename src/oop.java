public class oop {
    //Example of encapsulation 
    public static void main(String[] args) {
        emp e = new emp();
        e.name = "Afnan Baig";
        e.id = 10;
        e.details(10);
        e.details("google");
        e.details(e.name,e.id);
    }
}
class emp{
    String name;
    int id;
    public void details(String name){
        System.out.println(name);
    }
    public void details(int id){
        System.out.println(id);
    }
    public void details(String name, int id){
        System.out.println(name+" "+id);
    }
}
