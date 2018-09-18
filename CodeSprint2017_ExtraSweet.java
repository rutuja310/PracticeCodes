import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = in.nextInt();
        Map<Long, Long> map = new HashMap<>();
        
        for(int a0 = 0; a0 < s; a0++){
            Long l = in.nextLong();
            Long r = in.nextLong();
            Long sum = (r*(r+1)-l*(l-1))/2 ;           
            l--;
            r++;
            while(map.containsKey(l)){
                l = map.get(l);
            }
            while(map.containsKey(r)){
                r = map.get(r);
            }
            if(l>=0){
                sum += l;
                map.put(l, r+1); //When you seek for index l goto r+1
            }
            if(r<n){
                sum += r;
                map.put(r, l-1); //And when you seek for index r goto l-1
            }
              System.out.println(sum);    
            }    
        in.close();
    }
}
       
