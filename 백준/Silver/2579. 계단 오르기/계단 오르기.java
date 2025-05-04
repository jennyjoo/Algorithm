import java.util.*;
import java.io.*;

public class Main {

    static int N;
    static int[] dp;
    static int[] map;

    static long dynamic(int target){

        // 이거 조심! index out of bound error
        if(target == 1) return map[1];
        if(target == 2) return map[1] + map[2];
        
        dp[1] = map[1];
        dp[2] = map[1] + map[2];

        for(int i = 3; i <= target; i++){
            int jumpOneStair = dp[i - 3] + map[i-1];
            int jumpTwoStairs = dp[i-2];
            dp[i] = Math.max(jumpTwoStairs, jumpOneStair) + map[i];
        }

        return dp[target];
    }
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        dp = new int[N + 1];
        map = new int[N + 1];


        for(int i = 1; i <= N; i++){
            map[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(T.dynamic(N));
    }
}