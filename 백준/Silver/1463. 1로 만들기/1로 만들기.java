import java.util.*;
import java.io.*;

public class Main {

    static int N;
    static int[] dp;

    static int dynamic(int target){

        /**
         * 1. 3k
         * 2. 2k
         * 3. 6k + 1, 6k - 1
         */

        for(int i = 4; i <= target; i++){

            /**
             * else if로 하면 안 됨
             *
             * 3이랑 2 둘 다로 나눠질 때의 min값 찾지 못함,
             * if..if 로 갱신하게 해야함
             *
             *   if(i % 3 == 0){ // 1
             *      dp[i] = Math.min(dp[i/3], dp[i-1]) + 1;
             *   }
             *   else if(i % 2 == 0){ // 2
             *      dp[i] = Math.min(dp[i/2], dp[i-1]) + 1;
             *   }
             *   else{
             *      dp[i] = dp[i-1] + 1;
             *   }
             */



            dp[i] = dp[i-1] + 1;

            if(i % 3 == 0){ // 1
                dp[i] = Math.min(dp[i/3] + 1, dp[i]);
            }
            if(i % 2 == 0){ // 2
                dp[i] = Math.min(dp[i/2] + 1, dp[i]);
            }

        }

        return dp[target];
    }
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        dp = new int[(int)Math.pow(10, 6) + 1];

        dp[3] = 1;
        dp[2] = 1;
        dp[1] = 0; // 1은 목표라서 0

        System.out.println(dynamic(N));
    }
}