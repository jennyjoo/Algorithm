// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.io.*;

class Main {
  
    static int N;
    static int T;
  
    private int[] getTable(int s, int i, int c){
      int[] result = new int[c];
      
      int index = 0;
      int k = 0;
      while(index < c){
        result[index++] = s + k;
        k += i;
      }
      
      return result;
    }
    
    
    public static void main(String[] args) throws IOException {
        Main M = new Main();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        T = Integer.parseInt(st.nextToken());
        
        int answer = Integer.MAX_VALUE;
        
        for(int busNum = 0; busNum < N; busNum++){
          st = new StringTokenizer(br.readLine());
          
          int s = Integer.parseInt(st.nextToken());
          int i = Integer.parseInt(st.nextToken());
          int c = Integer.parseInt(st.nextToken());
          
          int[] map = M.getTable(s, i, c);
          
          // for(int dd : map){
          //   System.out.println(dd);
          // }
          

          int lt = 0;
          int rt = map.length-1;
          int mid = 0;
          
          while(lt < rt){
            mid = (lt + rt)/2;
            
            int t = map[mid];
            if(t < T){
              lt = mid + 1;
            }
            else {
              rt = mid;
            }
          }
          
          
          if(map[rt] < T) {
            continue;
          }
          
          answer = (int)Math.min(answer, map[rt] - T);
          // answer = map[rt] - T;
        }
        
        System.out.println(answer == Integer.MAX_VALUE ? -1 : answer);
    }
}




