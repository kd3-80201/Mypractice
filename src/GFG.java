//{ Driver Code Starts
//Initial Template for Java

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class pair
{
    long first, second;
    public pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
}

class GFG {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
        int t =
                Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }

            Compute obj = new Compute();
            pair product = obj.getMinMax(a, n);
            System.out.println(product.first+" "+product.second);

        }
    }
}


// } Driver Code Ends


//User function Template for Java

/*
 class pair
{
    long first, second;
    public pair(long first, long second)
    {
        this.first = first;
        this.second = second;
    }
} */

class Compute
{
    static pair getMinMax(long a[], long n)
    {
        int first = Integer.MAX_VALUE;
        int second = Integer.MIN_VALUE;
        //Write your code here
        int i;
        if(n==1){
             first = (int) a[0];
             second = (int) a[0];
            
        }
        else if(n < 2){
            if(a[0]> a[1]){
                 first = (int) a[1];
                 second = (int) a[0];
            }
            else{
                 first = (int) a[0];
                 second = (int) a[1];
            }
            
        }
        else{
            for( i=0; i < n; i++){
                if(a[i]>  second){
                     second = (int) a[i];
                }
                if(a[i]<  first){
                     first = (int) a[i];
                }
            }
        }
        return new pair(first,second);
    }
}
