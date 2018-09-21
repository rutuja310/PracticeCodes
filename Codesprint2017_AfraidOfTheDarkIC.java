import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    private int V;
    private boolean bulb[];
    private LinkedList<Integer> adj[];
    
    Solution(int v){
        V = v;
        adj = new LinkedList[v];
        for(int i=0; i<v; i++){
            adj[i]= new LinkedList();
        }
    }
    
    void addEdge(int v1, int v2){
        adj[v1].add(v2);
    }
    
    void DFS(){
        int visitedNum[] = new int[V];
        boolean visited[] = new boolean[V];
        for(int i=0; i<V; i++){
            visitedNum[i]=DFSUtil(i, visited);
            System.out.println(visitedNum[i]);
        }
        
    }
    
    int DFSUtil(int v,boolean[] visited){
        
        //Stack<Integer> st = new Stack<>();
        int sum = 1;
        
        visited[v]=true;
        Iterator<Integer> i = adj[v].listIterator();
        while(i.hasNext()){
            int n=i.next();
            if(!visited[n]){
                if(bulb[n]==1)
                sum += DFSUtil(n, visited);
            }
        }
        return sum;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tests = sc.nextInt();
        for(int t=0;t <tests; t++){
            int rooms = sc.nextInt();
            bulb[] = new boolean[rooms];
            for(int r=0; r<rooms; r++){
                bulb[r]=sc.nextInt();
            }
            Solution s = new Solution(rooms);
            //boolean[][] area = new boolean[rooms][rooms];
            for(int r=0; r<rooms-1; r++){
                int i=sc.nextInt();
                int j = sc.nextInt();
                s.addEdge(i, j);
            }
            //int result[] = new int[rooms];
            s.DFS();
        }
    }
    
    
}
