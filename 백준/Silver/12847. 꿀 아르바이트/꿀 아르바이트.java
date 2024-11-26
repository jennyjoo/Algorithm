import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        long[] arr = new long[n + 1];
        for(int i = 1; i < n + 1; i++){
            arr[i] = Integer.parseInt(st.nextToken()) + arr[i - 1];
        }

        long max = 0;
        for(int i = m; i <= n; i++){
            max = (long) Math.max(arr[i] - arr[i - m], max);
        }

        System.out.println(max);

    }
}