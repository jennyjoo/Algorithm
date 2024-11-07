import java.util.*;
import java.io.*;

public class Main {

    static int[] arr;
    static int N, K;
    static int cnt = 0;

    public void backtracking(int depth, int sum){
        if(depth == N){
            if(sum == K) cnt++;
            return;
        }

        backtracking(depth + 1, sum + arr[depth]);
        backtracking(depth + 1, sum);
    }
    public static void main(String[] args) throws IOException{
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        T.backtracking(0,0);
        if(K == 0) cnt--;

        System.out.println(cnt);

    }


}