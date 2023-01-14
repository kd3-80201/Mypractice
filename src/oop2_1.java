class avengers{
    private int ironMan;

    private String captain;
    String s = "haa";
public void game(int g,String c){
    ironMan = g;
    captain = c;
}
//public int yeah(){
//    return ironMan;
//}
//public String yeah2() {
//    return captain;
//}
    public void anything(){
        System.out.println(ironMan+" \n"+captain);
    }
}
public class oop2_1 {
    public static void main(String[] args) {
        avengers av = new avengers();
        System.out.println(av.s); // this public variable can be accessed anywhere in the class outside the class
//        System.out.println(av.ironman); // private variable can't be accessed outside the class
        av.game(35,"SteveRogers");
//        System.out.println(av.yeah());
//        System.out.println(av.yeah2());

        av.anything(); // this void method will print without any return
    }
}
