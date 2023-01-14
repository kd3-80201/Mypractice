public class oop6 {
    //OBJECT COPYING
    int i;
    int j;
    int k;
    public static void main(String[] args) {
        oop6 op6 = new oop6();
        op6.i = 5;
        op6.j = 6;
        op6.k = 10;
        //{...................shallow copy..................}
        oop6 ip = op6; // it copies the values of op6 but doesn't have any object it's just creating another reference that is pointing to one object{new oop6}
        ip.i = 15;
        ip.j = 44;

        //System.out.println(ip.i+" "+ip.j); // 15 44

        //System.out.println(op6.i+" "+op6.j);

        // 15 44 the older object suppose to be 5 and 6, but it's showing the 15 44 values
        // that's because we aren't actually creating an object, we are creating one object with two reference

        //{..................Deep Copy......................}
        // In deep copy we are creating an object and manually copying the values which takes time if the values are like 30
        // this method can work, but it's not such efficient to do things
        // so to do this effectively we can use [OBJECT CLONING] it's a combination of shallow copy and deep copy
        oop6 apple = new oop6();
        apple.i = op6.i; // Manually copying
        apple.j = op6.j;
        apple.k = op6.k;

        System.out.println(apple.i+" "+ apple.j+" "+apple.k);

        System.out.println(op6.i+" "+op6.j+" "+ op6.k);

    }
}
