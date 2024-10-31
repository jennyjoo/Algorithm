import java.io.*;
import java.util.*;

public class Main {

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {-1, 0, 1, 0};
    static boolean[][] visited;
    static int[][] tomato;
    static int row, col;
    static int totalTomato;

    class Point{
        int x, y;
        int day;
        Point(int x, int y, int day){
            this.x = x;
            this.y = y;
            this.day = day;
        }
    }
    private boolean isNext(int x, int y){
        if(x < 0 || y < 0 || x >= col || y >= row ){
            return false;
        }
        return true;
    }


    private void solution(){

        Queue<Point> q = new LinkedList<>();
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(tomato[i][j] != -1) totalTomato++;
                if(tomato[i][j] == 1){
                    q.offer(new Point(j, i, 0));
                    visited[i][j] = true;
                    totalTomato--;
                }
            }
        }
        if(totalTomato == 0){
            System.out.println(0);
            return;
        }

        while(!q.isEmpty()){
            Point curr = q.poll();

            for(int d = 0; d < 4; d++){
                int nx = curr.x + dx[d];
                int ny = curr.y + dy[d];

                if(isNext(nx, ny) && tomato[ny][nx] != -1 && tomato[ny][nx] != 1){
                    q.offer(new Point(nx, ny, curr.day + 1));
                    tomato[ny][nx] = 1;
                    totalTomato--;
                    if(totalTomato == 0){
                        System.out.println(curr.day + 1);
                        return;
                    }
                }
            }
            
        }

        System.out.println(-1);
        return;

    }
    public static void main(String[] args) throws IOException {

        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        col = Integer.parseInt(st.nextToken());
        row = Integer.parseInt(st.nextToken());

        tomato = new int[row][col];
        visited = new boolean[row][col];



        for(int r = 0; r < row; r++){
            st = new StringTokenizer(br.readLine());
            for(int c = 0; c < col; c++){
                int val = Integer.parseInt(st.nextToken());
                tomato[r][c]= val;
            }
        }

        T.solution();


    }

}
