import java.util.*;
import java.io.*;

public class Main {
    static int[] dx = {1, 1, -1, -1};
    static int[] dy = {1, -1, 1, -1};
    static boolean[][] visited;
    static int[][] map;
    static int N, M;

    static int max = 0;

    private boolean isNext(int nx, int ny){
        if(nx < 0 || ny < 0 || nx >= M || ny >= N || visited[ny][nx]) return false;
        return true;
    }
    private void backtracking(int start, int sum){
        max = (int)Math.max(max, sum);

        for(int i = start; i < N * M; i++){
            int x = i % M;
            int y = i / M;

            if(visited[y][x]) continue;

            for(int d = 0; d < 4; d++){
                int nx = x + dx[d];
                int ny = y + dy[d];

                int tmp = sum;
                if(isNext(nx, y) && isNext(x, ny)){
                    tmp += map[y][x] * 2;
                    tmp += map[ny][x];
                    tmp += map[y][nx];
                    visited[ny][x] = true;
                    visited[y][nx] = true;
                    visited[y][x] = true;
      
                    backtracking(i + 1, tmp);
                    visited[ny][x] = false;
                    visited[y][nx] = false;
                    visited[y][x] = false;
                }
            }
        }

    }

    public static void main(String[] args) throws IOException{
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        visited = new boolean[N][M];
        map = new int[N][M];

        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < M; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        T.backtracking(0,0);
        System.out.println(max);


    }


}