import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder()
;
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[] arr = new int[a + 1];
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= a; i++){
            arr[i] = Integer.parseInt(st.nextToken()) + arr[i-1];
        }

        int answer = 0;
        for(int i = 1; i < a + 1; i++){
            for(int j = 0; j < a; j++){
                int del = arr[i] - arr[j];
                if(del == b) answer++;
            }
        }

        System.out.println(answer);


    }
}