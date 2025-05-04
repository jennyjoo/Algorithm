import java.util.*;
import java.io.*;

public class Main {

    static int N;
    static long[] dp;

    static long dynamic(int target){

        for(int i = 3; i <= target; i++){
            dp[i] = dp[i-2]%10007 + dp[i-1]%10007 ;
        }

        return dp[target];
    }
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(br.readLine());
        dp = new long[10001];


        dp[2] = 2;
        dp[1] = 1;


        sb.append(dynamic(N)%10007);


        System.out.println(sb.toString());
    }
}