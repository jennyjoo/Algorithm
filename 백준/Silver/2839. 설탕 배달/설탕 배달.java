import java.util.*;
import java.io.*;

public class Main {

    static int N;
    static int[] dp;

    static int dynamic(int target){

        /**
         * 1. 5k (또는 15k)
         * 2. 5k + 3n
         * 3. 5k + (3n + 1) / 5k + (3n + 2)
         */

        if(target == 5 || target == 3) return 1;
        if(target < 5) return -1;
        for(int i = 5; i <= target; i++){

            if(i%5 == 0){ // 1. 5k
                dp[i] = i/5;
            }
            else{ // 2. 5k + 3n
                if(dp[i - 5] != 0){ // 더 큰 수인 5 체크
                    dp[i] = dp[i-5] + 1;
                }
                else if(dp[i - 3] != 0){
                    dp[i] = dp[i - 3] + 1;
                }
            }
        }

        return dp[target] == 0 ? -1 : dp[target];
    }
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        dp = new int[50001];

        dp[3] = 1;
        dp[5] = 1;

        System.out.println(dynamic(N));
    }
}