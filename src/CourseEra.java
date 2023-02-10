public class CourseEra {
    public static void main(String[] args) {
CourseEra c = new CourseEra();
//c.findAbc("abcd");
c.test();
    }
    public void findAbc(String input) {
        int index = input.indexOf("abc");
        while (true) {
            if (index == -1) {
                break;
            }
            String found = input.substring(index+1, index+4);
            System.out.println("First value: "+index+1);
            System.out.println("second value: "+index+4);
            System.out.println(found);
            System.out.println("it has to be seen here");
            index = input.indexOf("abc", index+4);
        }
    }
    public void test() {
        //no code yet
        findAbc("aaaaabc");
    }
}
