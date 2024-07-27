import java.io.*;
import java.util.*;

public class Main {

   public int solution(int[] components, int m){
       int lt = 0;
       int rt = components.length - 1;
       int cnt = 0;

       while(lt < rt){
           int first = components[lt];
           int second = components[rt];

           if(first + second < m){
               lt++;
           }else{
               if(first + second == m){
                   lt++; rt--;
                   cnt++;
               }
               else{
                   rt--;
               }
           }
       }

       return cnt;
   }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] components = new int[n];
        for(int i = 0; i < n; components[i++] = Integer.parseInt(st.nextToken())){}

        int m = Integer.parseInt(br.readLine());

        Arrays.sort(components);
        System.out.println(T.solution(components, m));

    }
}
