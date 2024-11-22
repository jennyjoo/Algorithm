import java.util.*;
import java.io.*;

public class Main {

    class Point{
        int x, y;

        Point(int x, int y){
            this.x = x; this.y = y;
        }
    }

    static boolean[][] visited;
    static int[][] map;
    static int w, h, cnt = 0;
    static int[] dx = {0, 1, 1, 1, 0, -1, -1, -1}, dy = {-1, -1, 0, 1, 1, 1, 0, -1};

    private boolean isNext(int nx, int ny){
        if(nx < 0 || ny < 0 || nx >= w || ny >= h || visited[ny][nx]) return false;
        return true;
    }

    private void BFS(int x, int y){
        Queue<Point> q = new ArrayDeque<>();
        q.offer(new Point(x, y));
        visited[y][x] = true;

        while(!q.isEmpty()){
            Point curr = q.poll();

            for(int d = 0; d < 8; d++){
                int nx = curr.x + dx[d];
                int ny = curr.y + dy[d];

                if(isNext(nx, ny) && map[ny][nx] == 1) {
                    q.offer(new Point(nx, ny));
                    visited[ny][nx] = true;
                }
            }
        }

        cnt++;
    }
    private int solution(int[][] map){
        cnt = 0;
        visited = new boolean[map.length][map[0].length];

        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[0].length; j++){
                if(map[i][j] == 1 && !visited[i][j]){
                    BFS(j, i);
                }
            }
        }

        return cnt;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st;

        while(true){
            st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            if(w == 0 && h == 0) break;

            map = new int[h][w];

            for(int i = 0; i < h; i++){
                st = new StringTokenizer(br.readLine());
                for(int j = 0; j < w; j++){
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            sb.append(T.solution(map)).append("\n");
        }

        System.out.println(sb.toString().trim());
    }
}