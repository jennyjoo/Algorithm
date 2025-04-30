import java.util.*;
import java.io.*;

public class Main {

    static long[] prefixSum;
    static long[] arr;
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        arr = new long[N + 1];
        prefixSum = new long[N + 1];



        for(int i = 0; i < N; i++){
            long input = Long.parseLong(st.nextToken());
            arr[i + 1] = input;
            prefixSum[i + 1] = prefixSum[i] + input;
        }

        /**
         * 왼쪽 -> 오른쪽
         */
        long answer = 0;
        for(int i = 2; i < N; i++){
            long bee1 = prefixSum[N] - prefixSum[1] - arr[i];
            long bee2 = prefixSum[N] - prefixSum[i];
            answer = Math.max(answer, bee1 + bee2);
        }


        /**
         * 왼쪽 <- 오른쪽
         */
        for(int i = N-1; i > 1; i--){ // i의 최솟값이 1이면 안 됨! 벌 위치 겹칠 수 있음
            long bee1 = prefixSum[N - 1] - arr[i]; // 벌1: 오른쪽 끝 → 2~(N-1)까지, i는 제외
            long bee2 = prefixSum[i] - arr[i];                     // 벌2: i 왼쪽까지
            answer = Math.max(answer, bee1 + bee2);
        }


        /**
         *  -> 가운데 <-
         */
        for(int i = 2 ; i <= N-1; i++){
            long bee1 = prefixSum[i] - prefixSum[1];
            long bee2 = prefixSum[N-1] - prefixSum[i] + arr[i];
            answer = Math.max(answer, bee1 + bee2);
        }
        System.out.println(answer);

    }
}