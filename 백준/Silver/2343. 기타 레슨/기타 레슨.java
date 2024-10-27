import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main {

    private void solution(int len, int min, int max, int M, int[] lessons){
        int lt = min;
        int rt = max;
        int mid;

        while(lt < rt){
            mid = (lt + rt)/2;

            int sum = 0;
            int count = 0;
            for(int i = 0; i < len; i++){
                sum += lessons[i];
                if(sum > mid){
                    count++;
                    sum = lessons[i];
                }
            }

            if(count >= M){
                lt = mid + 1;
            }
            else{
                rt = mid;
            }
        }

        System.out.println(lt);

    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] lessons = new int[N];

        int min = 0, max = 0;
        for(int i = 0; i < N; i++){
            int in = Integer.parseInt(st.nextToken());
            lessons[i] = in;
            max += in;
            if(in > min) min = in;
        }

        T.solution(N, min, max, M, lessons);

    }
}