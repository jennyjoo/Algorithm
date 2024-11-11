import java.util.*;
import java.io.*;

public class Main {

    static boolean[] visited;
    static int[] out;

    static StringBuilder sb = new StringBuilder();
    private void backtracking(int depth, int n){
        if(depth == n){
            for(int i = 0; i < n; i++){
                sb.append(out[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for(int i = 1; i <= n; i++){
            if(visited[i]) continue;
            visited[i] = true;
            out[depth] = i;
            backtracking(depth + 1, n);
            visited[i] = false;
        }
    }
    public static void main(String[] args) throws IOException{
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        visited = new boolean[N + 1];
        out = new int[N];

        T.backtracking(0, N);

        System.out.println(sb.toString());


    }

}