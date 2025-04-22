import java.util.*;
import java.io.*;

public class Main {

 
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N + 1][M+1];
        for(int i = 1; i <= N; i++){
            st = new StringTokenizer(br.readLine());
            int j = 1;

            while(st.hasMoreTokens()){
                arr[i][j] = Integer.parseInt(st.nextToken()) + arr[i][j-1];
                j++;
            }
        }

//        for(int[] row : arr){
//            for(int col : row){
//                System.out.print(col + " ");
//            }
//            System.out.println();
//        }

        int trial = Integer.parseInt(br.readLine());

        for(int t = 0; t < trial; t++){
            st = new StringTokenizer(br.readLine());
            int j = Integer.parseInt(st.nextToken());
            int i = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());

            int xstart = i - 1;
            int xend = x;

            int ystart = j;
            int yend = y;


            int sum = 0;
            for(int _y = ystart; _y <= yend; _y++){
                sum += (arr[_y][xend] - arr[_y][xstart]);
            }
            sb.append(sum).append("\n");

        }

        System.out.println(sb.toString().trim());

    }
}