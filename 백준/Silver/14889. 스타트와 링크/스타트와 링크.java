import java.util.*;
import java.io.*;

public class Main {

    static int[][] arr;
    static int N;
    static boolean[] visited;
    static int sum;
    static int MIN = Integer.MAX_VALUE;

    public void backtracking(int depth, int start){
        if(depth == N/2){
            int s1 = 0;
            for(int i = 1; i <= N; i++){
                if(!visited[i]) continue;
                for(int j = i + 1; j <= N; j++){
                    if(!visited[j]) continue;
                    s1 += arr[i][j] + arr[j][i];
                }
            }

            int s2 = 0;
            for(int i = 1; i <= N; i++){
                if(visited[i]) continue;
                for(int j = i + 1; j <= N; j++){
                    if(visited[j]) continue;
                    s2 += arr[i][j] + arr[j][i];
                }
            }

            MIN = Math.min(MIN, Math.abs(s1 - s2));
            return;
        }

        for(int i = start; i <= N; i++){
            if(visited[i]) continue;

            visited[i] = true;
            backtracking(depth + 1, i + 1);
            visited[i] = false;
        }
    }
    public static void main(String[] args) throws IOException{
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N + 1][N + 1];
        visited = new boolean[N + 1];
        visited[0] = true;

        StringTokenizer st;
        for(int i = 1; i <= N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 1; j <= N; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                sum += arr[i][j];
            }
        }

        T.backtracking(0, 1);
        System.out.println(MIN);

    }


}