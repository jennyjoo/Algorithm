import java.util.*;
import java.io.*;

public class Main {


    private int dynamic(int[] arr) {

        int[] dp = new int[arr.length];
        dp[0] = 1;


        // 버블소트 돌면서, arr[i] 보다 작은 arr[j]들 중에서
        // Math.max(dp[j] 값) + 1

        // 그러니까 arr[i]보다 작은 숫자들 중에서 dp값 가장 긴 애 + 1로 갱신하겠다는 뜻
        for(int i = 1; i < dp.length; i++){
            for(int j = 0; j < i; j++){
                if(arr[i] > arr[j]){
                    dp[i] = Math.max(dp[j], dp[i]);
                }
            }
            dp[i]++;
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