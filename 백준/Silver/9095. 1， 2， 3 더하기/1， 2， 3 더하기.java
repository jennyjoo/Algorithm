import java.util.*;
import java.io.*;

public class Main {

    static int N;
    static int[] dp;

    static int dynamic(int target){

        /**
         * 1. 1 + dp[i - 1]
         * 2. 2 + dp[i - 2]
         * 3. 3 + dp[i - 3]
         */

        for(int i = 4; i <= target; i++){

//            dp[i] += dp[i - 3];
//            dp[i] += dp[i - 2];
//            dp[i] += dp[i-1];

            /**
             * dp[i] = A일때
             * dp[i] += dp[i - 3];
             * dp[i] += dp[i - 2];
             * dp[i] += dp[i-1];
             *
             * 는
             *
             * dp[i] == A + dp[i - 3] + dp[i - 2] + dp[i-1]
             *
             * 이므로,
             *
             * dp[i] (A) 값이 0이 아닐 경우, 값이 누적됨 => dynamic 함수를 두 바퀴째 돌 때는 다른 값이 될 수 있다
             */

            dp[i] = dp[i - 3] + dp[i - 2] + dp[i-1];

        }

        return dp[target];
    }
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        dp = new int[100];


        // dp[6] : 1 dp[5], 2 dp[4], 3 dp[3]
        // dp[5] : 1 dp[4], 2 dp[3], 3 dp[2]
        // dp[4] : 1111, 1 1 2, 1 2 1, 1 3, // 2 1 1, 2 2 // 3 1
        dp[3] = 4; // 1 1 1, 1 2, // 2 1, 3
        dp[2] = 2; // 1 1, 2
        dp[1] = 1; // 1은 목표라서 0


        for(int i= 0; i < N; i++){
            int input = Integer.parseInt(br.readLine());
            sb.append(dynamic(input)).append('\n');
        }

        System.out.println(sb.toString());
    }
}