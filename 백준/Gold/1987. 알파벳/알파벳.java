import java.util.*;
import java.io.*;

public class Main {

    static char[][] arr;
    static int r, c;
    boolean[] visited = new boolean[26];
    static int[] dx = {0, 1, 0, -1}, dy = {-1, 0, 1, 0};
    static int max = 0;

    public void backtracking(int x, int y, int cnt){

        int index = arr[y][x] - 'A';
        visited[index] = true;

        for(int d = 0; d < 4; d++){
            int nx = x + dx[d];
            int ny = y + dy[d];

            if(nx >= 0 && ny >= 0 && nx < c && ny < r && !visited[arr[ny][nx] - 'A']){
                visited[arr[ny][nx] - 'A'] = true;
                backtracking(nx, ny, cnt + 1);
                visited[arr[ny][nx] - 'A'] = false;
            }
        }

        max = (int)Math.max(max, cnt);
    }

    public static void main(String[] args) throws IOException{
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        arr = new char[r][c];
        for(int i = 0; i < r; i++){
            String[] input = br.readLine().split("");
            for(int j = 0; j < c; j++){
                arr[i][j] = Character.toUpperCase(input[j].charAt(0));
            }
        }

        T.visited[arr[0][0] -'A'] = true;
        T.backtracking(0,0,0);
        System.out.println(max + 1);


    }


}