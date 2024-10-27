import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main {

    static StringBuilder sb = new StringBuilder();

    private int binarySearch(int target, int[] space){
        int l = 0;
        int r = space.length;
        int mid;

        while(l < r){
            mid = (l + r)/2;

            if(space[mid] < target){
                l = mid + 1;
            }
            else{
                r = mid;
            }
        }

        return l;
    }
    private void solution(int[] A, int[] B){

        int cnt = 0;
        for(int i : A){
            if(i <= B[0]) continue;

            int index = binarySearch(i, B);
            cnt += index;
        }

        sb.append(cnt).append("\n");

    }


    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());
        for(int k = 0; k < testCase; k++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int[] A = new int[N];
            int[] B = new int[M];

            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < N; i++){
                A[i] = Integer.parseInt(st.nextToken());
            }

            st = new StringTokenizer(br.readLine());
            for(int i = 0; i < M; i++){
                B[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(B);

            T.solution(A, B);
        }

        System.out.println(sb.toString());


    }
}