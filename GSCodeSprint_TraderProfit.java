import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int traderProfit(int k, int n, int[] A) {
        // Complete this function
        int profit[][] = new int[k+1][n+1];
        
        for(int i=0; i<k; i++){
            profit[i][0]=0;
        }
        for(int i=0; i<n; i++){
            profit[0][i]=0;
        }
        
        for(int i=1; i<=k; i++){
            for(int j=1; j<n; j++){
                int max = 0;
                for(int m=0; m<j; m++){
                    max = Math.max(max, A[j]-A[m]+profit[i-1][m]);
                    
                }
                
                profit[i][j]=Math.max(profit[i][j-1], max);
            }
        }
        
        return profit[k][n-1];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int k = in.nextInt();
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int arr_i = 0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            int result = traderProfit(k, n, arr);
            System.out.println(result);
        }
        in.close();
    }
}
