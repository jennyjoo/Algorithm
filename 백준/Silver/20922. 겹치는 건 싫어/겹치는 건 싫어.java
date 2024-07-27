import java.io.*;
import java.util.*;

public class Main {
    
    public int solution(int[] arr, int n, int k){

        int lt = 0, rt = 0;
        int[] cnt = new int[1000001];
        int result = 0;

        //rt가 기준
        while(rt < n){
            
            while(rt < n && cnt[arr[rt]] < k){
                cnt[arr[rt++]]++;
            }

            result = Math.max(result, rt - lt);
            cnt[arr[lt++]]--;

        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n;  arr[i] = Integer.parseInt(st.nextToken()),i++);

        System.out.println(T.solution(arr, n , k));


    }
}
