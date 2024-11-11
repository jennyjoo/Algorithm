import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st ;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> Integer.compare(o2, o1));

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            int cnt = Integer.parseInt(st.nextToken());
            if (cnt == 0) {
                if(pq.isEmpty()) sb.append("-1").append("\n");
                else sb.append(pq.poll()).append("\n");
            }
            else{
                while(st.hasMoreTokens()){
                    pq.add(Integer.parseInt(st.nextToken()));
                }
            }
        }

        System.out.println(sb.toString());

    }
}