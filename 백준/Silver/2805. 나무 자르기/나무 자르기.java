import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main {


    private long solution(int N, int M, int[] trees){
        long answer = 0;

        long l = 0;
        long r = Arrays.stream(trees).max().getAsInt();
        long height = 1;

        while(l < r){
            height = (l + r)/2;

            long count = 0;
            for(int i = 0; i < N; i++){
                long cut = Math.max(0, trees[i] - height);
                count += cut;
            }

            if(count < M){
                r = height;
            }
            else{
                l = height + 1;
            }

        }

        answer = l-1;
        return answer;
    }
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] trees = new int[N];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            trees[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(T.solution(N, M, trees));

    }
}