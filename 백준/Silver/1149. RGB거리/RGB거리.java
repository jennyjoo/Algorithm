import java.util.*;
import java.io.*;

public class Main {


    static int[][] dp;
    static int[][] arr;

    // 진우의 달 여행이랑 비슷하네
    // https://www.acmicpc.net/problem/17484
    private int dynamic(int target) {

        for(int i = 0; i < 3; i++){
            dp[0][i] = arr[0][i];
        }

        for(int i = 1; i <= target; i++){
            dp[i][0] = Math.min(dp[i-1][1], dp[i-1][2]) + arr[i][0];
            dp[i][1] = Math.min(dp[i-1][0], dp[i-1][2]) + arr[i][1];
            dp[i][2] = Math.min(dp[i-1][0], dp[i-1][1]) + arr[i][2];
        }

        int min = Arrays.stream(dp[target]).min().getAsInt();
        return min;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        arr = new int[N + 1][3];
        for(int i = 0; i < N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 3; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dp = new int[1001][3];

        sb.append(T.dynamic(N));
        System.out.println(sb.toString());
    }
}