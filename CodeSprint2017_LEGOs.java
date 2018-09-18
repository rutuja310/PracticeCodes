import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int productOfLegoTypes(int a, int b, int c, int d, int p, int q) {
        // Return the product of r and s
        if(a==p||a==q){
            if(a==p){
                p=-1;
            }
            else{
                q=-1;
            }
            a=1;
        }
        if(b==p||b==q){
            if(b==p){
                p=-1;
            }
            else{
                q=-1;
            }
            b=1;
        }
        if(c==p||c==q){
            if(c==p){
                p=-1;
            }
            else{
                q=-1;
            }
            c=1;
        }
        if(d==p||d==q){
           if(d==p){
                p=-1;
            }
            else{
                q=-1;
            }
            d=1;
        }
        
        return a*b*c*d;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();
            int p = in.nextInt();
            int q = in.nextInt();
            int answer = productOfLegoTypes(a, b, c, d, p, q);
            System.out.println(answer);
        }
        in.close();
    }
}
