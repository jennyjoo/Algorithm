import java.io.*;
import java.util.*;

public class Main {

   public int solution(int[] components, int k){
       int lt = 0;
       int rt = components.length - 1;

       int cnt = 0;

       while(lt < rt){
           int first = components[lt];
           int second = components[rt];

           if(first + second < k){
               lt++;
           }
           else if (first + second == k){
              cnt++;
              lt++;
              rt--;
           }
           else {
               rt--;
           }
       }

       return cnt;
   }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] components = new int[n];

        for(int i = 0; i < n; components[i++] = Integer.parseInt(st.nextToken())){}

        Arrays.sort(components);
        System.out.println(T.solution(components, m));

    }
}
