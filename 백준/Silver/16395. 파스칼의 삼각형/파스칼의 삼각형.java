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

        int[][] pascal = new int[n][n];

        for(int i = 0; i < n; i++){
            pascal[i][0] = 1;
            pascal[i][i] = 1;
        }

        for(int i = 1; i < n; i++){
            for(int j = 1; j < i; j++){
                pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
            }
        }

        System.out.println(pascal[n-1][m-1]);
    }
}