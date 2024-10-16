import java.io.*;
import java.util.*;

public class Main {


    static int N, M;
    static int count = 0;

    private int solution(int n, int m){

        recursive(n, m);
        return count;
    }

    private void recursive(int n, int m){

        count += 1;

        if(n == m) {
            return;
        }

        int min = Math.min(n, m);
        int max = Math.max(n, m);

        recursive(min, max - min);
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        System.out.println(T.solution(N, M));

    }


}
