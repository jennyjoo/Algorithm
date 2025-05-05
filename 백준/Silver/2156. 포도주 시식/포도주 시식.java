import java.util.*;
import java.io.*;

public class Main {


    static int[] dp;
    static int[] arr;

    private int dynamic(int target) {

        dp[1] = arr[1];
        dp[2] = arr[1] + arr[2];
        if(target < 3) return dp[target];

        // 계단 오르기 문제랑 비슷
        // https://www.acmicpc.net/problem/2579

        /**
         * 차이가 있다면
         * 계단 오르기는 현재 값을 반드시 추가해야 하지만(현재 밟고있는 계단 점수)
         * 포도주는 현재 값을 추가하지 않을 수 있음(현재 포도주 안 마시고 넘어갈 수 있음)
         * 그래서 포도주의 경우의 수가 한 개 더 많음
         */

        for(int i = 3; i <= target; i++){
            dp[i] = Math.max(dp[i-3] + arr[i-1] + arr[i], Math.max(dp[i-2] + arr[i], dp[i-1])) ;
        }
        return Arrays.stream(dp).max().getAsInt();
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        arr = new int[10001];
        for(int i = 1; i <= N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        dp = new int[10001];

        sb.append(T.dynamic(N));
        System.out.println(sb.toString());
    }
}