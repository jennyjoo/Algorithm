import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main {

    private void solution(int cutTimes, int length, int[] points){

        int lt = 1;
        int rt = length;
        int mid;

        while(lt < rt){
            mid = (lt + rt)/2;

            int count = 0;

            int last = 0;
            for(int j = 0; j < points.length; j++){
                if(points[j] - last >= mid){
                    count++;
                    last = points[j];
                }
            }
            if(count > cutTimes){
                lt = mid + 1;
            }
            else{
                rt = mid;
            }
        }

        System.out.println(lt-1);
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        int[] points = new int[M + 1];
        int[] arr = new int[N];

        for(int i = 0; i < M; i++){
            points[i] = Integer.parseInt(br.readLine());
        }
        points[M] = L;

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        for(int i = 0; i < N; i++){
            T.solution(arr[i], L, points);
        }
    }
}