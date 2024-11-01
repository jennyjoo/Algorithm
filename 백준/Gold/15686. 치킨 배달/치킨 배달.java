import java.io.*;
import java.util.*;

//https://www.acmicpc.net/problem/13023
public class Main {

    static int ROW_START = 1, COL_START = 1;
    static int CHICKEN = 2, HOUSE = 1, EMPTY = 0;
    static int N;
    static int[][] map;
    static boolean[] visited;
    static List<Point> chicken;
    static List<Point> house;
    static int answer = Integer.MAX_VALUE;

    public class Point{
        int r, c;
        public Point(int r, int c){
            this.r = r;
            this.c = c;
        }
    }


    private void backtracking(int cnt, int n, int start){
        if(cnt == n){
            int total = 0;
            for(int h = 0; h < house.size(); h++){
                int min = Integer.MAX_VALUE;
                Point currH = house.get(h);
                for(int c = 0; c < chicken.size(); c++){
                    if(visited[c]){
                        Point currC = chicken.get(c);
                        int width = Math.abs(currH.c - currC.c);
                        int height = Math.abs(currH.r - currC.r);

                        if(min > width + height){
                            min = width + height;
                        }
                    }
                }

                total += min;
            }

            answer = Math.min(answer, total);
            return;
        }

        for(int i = start; i < chicken.size(); i++){
            if(!visited[i]){
                visited[i] = true;
                backtracking(cnt + 1, n, i + 1);
                visited[i] = false;
            }
        }
    }

    private void solution(int M){
        house = new ArrayList<>();
        chicken = new ArrayList<>();

        for(int i = 1; i <= N; i++){
            for(int j = 1; j <= N; j++){
                int num = map[i][j];
                if(num == CHICKEN) chicken.add(new Point(i, j));
                else if(num == HOUSE) house.add(new Point(i, j));
            }
        }

        visited = new boolean[chicken.size()];

        backtracking(0, M, 0);

        System.out.println(answer);
    }

    public static void main(String[] args) throws IOException {

        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        map = new int[N + 1][N + 1];

        for(int i = ROW_START; i <= N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = COL_START; j <= N; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        T.solution(M);

    }
}
