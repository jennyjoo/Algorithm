import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int h = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int[][] arr1 = new int[h][w];

        for(int i = 0; i <h; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < w; j++){
                arr1[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        for(int i = 0; i <h; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < w; j++){
                sb.append(arr1[i][j] + Integer.parseInt(st.nextToken())).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb.toString().trim());
    }
}