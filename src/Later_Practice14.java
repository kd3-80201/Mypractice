import java.util.Arrays;
//VarArgs
public class Later_Practice14 {

    public static void main(String[] args) {
        fun(12,23,56,89,5,6,15,9,6);
        fun("dkjd","dodudf","uioodui","ount");
    }
    static void fun(int...v){
        System.out.println(Arrays.toString(v));
    } //this is called method overloading when same function name with different data type is being called
    static void fun(String...v){
        System.out.println(Arrays.toString(v));
    }
}
