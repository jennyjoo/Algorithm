import java.io.*;
import java.util.*;

//https://www.acmicpc.net/problem/13023
public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] ans = new int[N];
        for(int i = 0; i < N; i++){
            int cnt = 0;
            for(int j = 0; j < N; j++){
                if(cnt == arr[i] && ans[j] == 0){
                    ans[j] = i + 1;
                    break;
                }
                else{
                    if(ans[j] == 0) cnt++;
                }
            }
        }

        for(int i : ans){
            System.out.print(i + " ");
        }


    }

}
