import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main {


    private void solution(int total, int max, int[] arr){
        int l = 1;
        int r = max;
        int mid;

        while(l <= r){
            mid = (l + r)/2;

            int sum = 0;
            for(int i = 0; i < arr.length; i++){
                int n = arr[i];
                if(n <= mid){
                    sum += n;
                }
                else{
                    sum += mid;
                }
            }

            if(sum <= total){
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }
        }

        System.out.println(r);
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int max = 0;
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            int n = Integer.parseInt(st.nextToken());
            arr[i] = n;
            max = Math.max(n, max);
        }

        int M = Integer.parseInt(br.readLine());


        T.solution(M, max, arr);

    }
}