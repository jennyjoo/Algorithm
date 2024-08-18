import java.io.*;
import java.util.*;

public class Main {

    static boolean[] visited;
    public void DFS(int depth, int N, int M, String str){
        if(depth == M){
            System.out.println(str.trim());
            return;
        }

        for(int i = 1; i <= N; i++){
            if(!visited[i]){
                visited[i] = true;
                DFS(depth + 1, N, M, str + i + " ");
                visited[i] = false;
            }
        }

    }

    public String[] solution(int N, int M){
        String[] answer = {};

        visited = new boolean[N+1];
        visited[0] = true;

        DFS(0, N, M, "");

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[] str = T.solution(N, M);
        for(String s : str){
            System.out.println(str);
        }

    }
}
