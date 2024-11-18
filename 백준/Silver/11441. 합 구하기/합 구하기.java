import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder()
;
        int a = Integer.parseInt(br.readLine());
        int[] arr = new int[a + 1];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= a; i++){
            arr[i] = Integer.parseInt(st.nextToken()) + arr[i-1];
        }

        int trial = Integer.parseInt(br.readLine());
        for(int t = 1; t <= trial; t++){
            st = new StringTokenizer(br.readLine());
            int f = Integer.parseInt(st.nextToken()) - 1;
            int b = Integer.parseInt(st.nextToken());

            sb.append(arr[b] - arr[f]).append("\n");
        }

        System.out.println(sb.toString());

    }
}