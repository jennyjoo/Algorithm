import java.util.*;
import java.io.*;

public class Main {
    static int[][] dp;
    static int[] weight, value;
    static int N, K;

    private int dynamic() {

        for(int i = 1; i <= K; i++){ // 과목
            for(int time = 1; time <= N; time++){ // 시간
                dp[i][time] = dp[i-1][time];
                if(this.weight[i] > time) continue;

                dp[i][time] = Math.max(dp[i][time], dp[i-1][time - this.weight[i]] + value[i]);
            }
        }

        return dp[K][N];
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); //공부시간
        K = Integer.parseInt(st.nextToken()); //과목 수

        weight = new int[K+1];
        value = new int[K+1];
        for(int i = 1; i <= K; i++){
            st = new StringTokenizer(br.readLine());
            value[i] = Integer.parseInt(st.nextToken());
            weight[i] = Integer.parseInt(st.nextToken());
        }

        dp = new int[K+1][N + 1];

        sb.append(T.dynamic());
        System.out.println(sb.toString());
    }
}