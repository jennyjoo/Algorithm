import java.io.*;
import java.util.*;

public class Main {

    static int[][] arr;
    static int[] dx = {0, 1, 0, -1}, dy = {-1, 0, 1, 0};
    static boolean[][] visited;
    static int N, M, K;
    static int answer = 0;

    class Point{
        int x, y;

        Point(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
    private void BFS(int x, int y){
        Queue<Point> q = new LinkedList<>();

        q.offer(new Point(x, y));
        visited[y][x] = true;
        while(!q.isEmpty()){
            Point curr = q.poll();

            for(int d = 0; d < 4; d++){
                int nx = curr.x + dx[d];
                int ny = curr.y + dy[d];

                if(isNext(nx, ny)){
                    visited[ny][nx] = true;
                    q.offer(new Point(nx, ny));
                }
            }

        }
        answer++;
    }

    private boolean isNext(int nx, int ny){
        if(nx < 0 || ny < 0 || nx >= M || ny >= N || visited[ny][nx] || arr[ny][nx] == 0) return false;

        return true;
    }
    private int solution(int[][] a){
        answer=0;
        arr = a;
        visited = new boolean[a.length][a[0].length];

        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                if(arr[i][j] == 1 && !visited[i][j]){
                    BFS(j, i);
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCases = Integer.parseInt(br.readLine());
        for(int i = 0; i < testCases; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            int[][] a = new int[N][M];
            for(int j = 0; j < K; j++){
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                a[y][x] = 1;
            }

            sb.append(T.solution(a)).append("\n");

        }

        System.out.println(sb.toString());
    }


}