import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main {

    private void solution(int M, int len, int max, int[] biscuits){

        int l = 1;
        int r = max + 1;
        int mid;

        while(l < r){
            mid = (l + r)/2;

            int count = 0;
            for(int i = 0; i < len; i++){
                if(biscuits[i] >= mid){
                    count += biscuits[i]/mid;
                }
            }

            if(count >= M){
                l = mid + 1;
            }
            else{
                r = mid;
            }
        }

        if(l == len){
            System.out.println(0);
        }
        else{
            System.out.println(l-1);
        }


    }


    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] biscuits = new int[N];
        int max = 0;
        st = new StringTokenizer(br.readLine());
        for(int i =0; i < N; i++){
            biscuits[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, biscuits[i]);
        }

        T.solution(M, biscuits.length, max, biscuits);



    }
}