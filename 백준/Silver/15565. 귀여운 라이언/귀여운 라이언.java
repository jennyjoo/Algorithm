import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];



        int lt = -1;
        int rt = 0;

        int oneCnt = 0;

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i] == 1){
                if(lt == -1) {lt = i;rt = lt + 1;}
                oneCnt++;
            }
        }

        if(lt == -1 || oneCnt < k){
            System.out.println(-1);
            return;
        }

        int cnt = 1;
        int min = Integer.MAX_VALUE;
        while(lt < n ){
            while(rt < n && cnt < k){
                if(arr[rt++] == 1) cnt += 1;
            }


            if(cnt == k) min = (int)Math.min(min, rt - lt);


            while(++lt <= rt && lt < n){
                if(arr[lt] == 1) break;
            }
            cnt -= 1;
        }

        System.out.println(min);

    }
}