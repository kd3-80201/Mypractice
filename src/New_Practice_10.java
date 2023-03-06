public class New_Practice_10 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        int  l = 9;
        pair minMax = solve(a,l);
        System.out.println("Minimum value: "+minMax.first);
        System.out.println("Maximum value: "+minMax.second);
        solve(a,l);
    }
    static class pair{
        int first;
        int second;
    }
    static pair solve(int[] a, int n){
        pair p = new pair();
        int i;
        if(n==1){
            p.first = a[0];
            p.second = a[0];
            return p;
        }
        else if(n == 2){
            if(a[0]> a[1]){
                p.first = a[1];
                p.second = a[0];
            }
            else{
                p.first = a[0];
                p.second = a[1];
            }
            return p;
        }
        else{
            for( i=0; i < n; i++){
                if(a[i]> p.second){
                    p.second = a[i];
                }
                if(a[i]< p.first){
                    p.first = a[i];
                }
            }
        }
        return p;
    }
}
