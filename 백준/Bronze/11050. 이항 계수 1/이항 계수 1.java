import java.io.*;
import java.util.*;

public class Main {

    private Integer solution(int n, int k){
        int answer = 0;

        n = n + 1;
        int[][] temp = new int[n][n];
        for(int i = 0; i < n; i++){
            temp[i][0] = 1;
            temp[i][i] = 1;
        }

        for(int i = 2; i < n; i++){
            for(int j = 1; j < n - 1; j++){
                temp[i][j] = temp[i-1][j-1] + temp[i-1][j];
            }
        }

        answer = temp[n - 1][k];

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        System.out.println(T.solution(N, K));

    }


}
