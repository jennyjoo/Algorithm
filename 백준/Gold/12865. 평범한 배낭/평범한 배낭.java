import java.util.*;
import java.io.*;

public class Main {
    static int[][] dp;
    static int[] weight, value;
    static int N, K;

    private int dynamic() {

        for(int i = 1; i <= N; i++){ // 물건 번호
            for(int weight = 1; weight <= K; weight++){ // 무게
                dp[i][weight] = dp[i-1][weight];
                if(this.weight[i] > weight) continue; //최대 용량보다 물건이 무거우면 안 됨
                // 전 단계(dp[i-1]) 에서 weight - weight[i] 의 값이랑 비교해야 하기 때문에
                // weight - weight[i] 값이 음수면 안 됨
                
                // dp[i-1][weight - this.weight[i]] 값을 봐야 해야하는데
                // weight - this.weight[i]가 음수면 안 되잖아요
                

                dp[i][weight] = Math.max(dp[i][weight], dp[i-1][weight - this.weight[i]] + value[i]);
            }
        }

        return dp[N][K];
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        weight = new int[N+1];
        value = new int[N+1];
        for(int i = 1; i <= N; i++){
            st = new StringTokenizer(br.readLine());
            weight[i] = Integer.parseInt(st.nextToken());
            value[i] = Integer.parseInt(st.nextToken());
        }

        dp = new int[N+1][K + 1];

        sb.append(T.dynamic());
        System.out.println(sb.toString());
    }
}