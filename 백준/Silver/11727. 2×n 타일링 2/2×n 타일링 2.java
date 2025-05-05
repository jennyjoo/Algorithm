import java.util.*;
import java.io.*;

public class Main {


    static int[] dp;
    private int dynamic(int target) {
        for(int i = 3; i <= target; i++){
            dp[i] = (dp[i-1] + dp[i-2] * 2)%10007;
        }
        return dp[target];
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        dp = new int[1001];

        dp[1] = 1;
        dp[2] = 1 + 1 + 1;

        if(N < 3){
            sb.append(dp[N]);
        }
        else{
            sb.append(T.dynamic(N));
        }

        System.out.println(sb.toString());
    }
}