import java.util.*;
import java.io.*;

public class Main {

    static int[] arr;
    static int N, K;
    static boolean[] visited;
    static int cnt = 0;

    public void backtracking(int depth, int n, int start){
        if(depth == n){
            int sum = 0;
            for(int i = 0; i < N; i++){
                if(visited[i]) sum += arr[i];
            }

            if(sum == K) cnt++;
            return;
        }

        for(int i = start; i < N; i++){
            if(visited[i]) continue;
            visited[i] = true;
            backtracking(depth + 1, n, i + 1);
            visited[i] = false;
        }
    }
    public static void main(String[] args) throws IOException{
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        visited = new boolean[N];

        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 1; i <= N; i++){
            T.backtracking(0, i, 0);
        }

        System.out.println(cnt);

    }


}