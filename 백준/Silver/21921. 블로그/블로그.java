import java.io.*;
import java.util.*;

//https://www.acmicpc.net/problem/13023
public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        int[] arr = new int[N + 1];

        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= N; i++){
            arr[i] = Integer.parseInt(st.nextToken()) + arr[i-1];
        }

        //===============

        int max = Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<>();
        int sum = 0;


        for(int i = X; i <= N ; i++){
            int curr = arr[i] - arr[i - X];
            list.add(curr);
            max = Math.max(max, curr);
        }

        int cnt = 0;
        for(int i : list){
            if(i == max) cnt++;
        }

        if(max == 0) {
            sb.append("SAD");
        }
        else{
            sb.append(max).append("\n").append(cnt);
        }
        System.out.println(sb.toString());

    }

}
