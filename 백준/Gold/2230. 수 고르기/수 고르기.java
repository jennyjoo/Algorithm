import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        int front = 0;
        int end = front + 1;

        long min = Long.MAX_VALUE;

        while(end < N && front <= end){
            int num = arr[end] - arr[front];

            if(num < M){
                end++;
            }
            else{
                min = Math.min(num, min);
                front++;
            }
        }

        System.out.println(min);

    }
}