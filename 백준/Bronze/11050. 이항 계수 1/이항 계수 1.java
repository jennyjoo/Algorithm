import java.io.*;
import java.util.*;

public class Main {

    static int count = 0;
    static boolean[] visited;
    private void solution(int k, int start){
        if(k == 0) {
            count++;
            return;
        }

        for(int i = start; i < visited.length; i++){
            if(!visited[i]){
                visited[i] = true;
                solution(k -1, i + 1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        visited = new boolean[N];

        T.solution(K, 0);
        System.out.println(count);

    }
}
