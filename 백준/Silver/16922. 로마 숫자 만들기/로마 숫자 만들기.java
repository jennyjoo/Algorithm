import java.io.*;
import java.util.*;


public class Main {

//    static Map<Integer, Integer> map ;
    static boolean[] visited;
    static int[] numbers;

    static int ans;

    public void DFS(int depth, int  N, int start, int sum){
        if(depth == N){
            if(!visited[sum]){
                ans++;
                visited[sum] = true;
            }
            return;
        }

        for(int i = start; i < 4; i++){
            DFS(depth + 1, N,  i ,sum + numbers[i]);
        }
    }

    public int solution(int N){
        int answer = 0;

        if(N == 1) return 4;

        DFS(0, N, 0, 0);

//        answer = set.size();
        return ans;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        visited = new boolean[N * 50 + 1];
        ans = 0;
        numbers = new int[]{1, 5, 10, 50};
//        map = new HashMap<>();
//        map.put(0, 1);
//        map.put(1, 5);
//        map.put(2, 10);
//        map.put(3, 50);

        System.out.println(T.solution(N));

    }
}
