import java.util.*;
import java.io.*;

public class Main {


    private int dynamic(int[] arr) {

        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        
        // 어찌 보면 누적합이랑 비슷
        // 누적합 시켜가면서 더하다가, 현재 값 arr[i]이 직전 누적합 값보다 클 때, dp[i] = arr[i] 된다는 차이점이 있다
        // 그러니까 누적합 값이랑, 현재 값 중에서 더 큰 값으로 저장함
        for(int i = 1; i < dp.length; i++){
            dp[i] = Math.max(dp[i-1] + arr[i], arr[i]);
        }

        return Arrays.stream(dp).max().getAsInt();
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        sb.append(T.dynamic(arr));

        System.out.println(sb.toString());
    }
}