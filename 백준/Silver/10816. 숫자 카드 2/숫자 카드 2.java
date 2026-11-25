import java.util.*;
import java.io.*;

public class Main {

    static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) {
            int count = map.getOrDefault(Integer.parseInt(st.nextToken()), 0);
            sb.append(count).append(" ");
        }


        System.out.println(sb);
    }
}