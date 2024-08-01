import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {


   public double solution(int n, int m){
       double initialZ = (double)m * 100 /n;

       if(initialZ >= 99) return -1;

       double start = 1;
       double end = Integer.MAX_VALUE;

       double lt = start;
       double rt = end;
       double mid = 0;

       double res = 0;

       while(lt <= rt){
           mid = (lt + rt)/2;

           int z = (int)((m + mid) * 100/(n + mid));

           if(initialZ < z) {rt = mid - 1; res = mid;}
           else lt = mid + 1;
       }



       return res;
   }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());


        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());


        //main
//        System.out.println(T.solution(cards, numbers));
        int res = (int)T.solution(n, m);

        System.out.println(res);
    }
}
