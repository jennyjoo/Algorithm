import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main {


    private long solution(int K, int N, int[] lans){
        long answer = 0;

        long l, r, mid;
        l = 1;
        r = Arrays.stream(lans).max().getAsInt();

        while(l <= r){

            mid = (l + r)/2;

            int count = 0;
            for(int i = 0; i < lans.length; i++){
                count += lans[i]/mid;
            }

            if(count < N) {
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }


        answer = l - 1;

        return answer;
    }
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] lans = new int[K];

        for(int i = 0; i < K; i++){
            lans[i] = Integer.parseInt(br.readLine());
        }

        System.out.println(T.solution(K, N, lans));

    }
}