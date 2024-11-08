import java.util.*;
import java.io.*;

public class Main {

    static  ArrayList<Integer>[] list;
    static int N, E;
    static boolean[] visited;

    static boolean has = false;

    void backtracking(int depth, int start){
        if(depth == 5){
            has = true;
            return;
        }

        visited[start] = true;
        for(int i : list[start]){
            if(!visited[i]){
                backtracking(depth + 1, i);
            }
        }

        visited[start] = false;
    }


    public static void main(String[] args) throws IOException{
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());

        visited = new boolean[N];
        list = new ArrayList[N];
        for(int i = 0;i < N; i++){
            list[i] = new ArrayList<>();
        }

        for(int i = 0; i < E; i++){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            list[a].add(b);
            list[b].add(a);
        }

        for(int i = 0; i < N; i++){
            if(has) break;
            T.backtracking(1, i);
        }

        System.out.println(has ? 1 : 0);

    }


}