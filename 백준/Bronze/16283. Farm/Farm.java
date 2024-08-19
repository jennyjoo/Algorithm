import java.io.*;
import java.util.*;


public class Main {


    public void solution(int a, int b, int n, int w){
        String answer = "";
        int ans = 0;

        for(int i = 1; i < n; i++ ){
            int sheep = a * i;
            int goat = b * (n - i);

            if(sheep + goat == w){
                if(ans > 0) {
                    System.out.println(-1);
                    return;
                }
                answer = i + " " + (n - i);
                ans++;
            }
        }

        System.out.println(answer.length() > 0 ? answer : -1);
    }
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());


        T.solution(a, b, n, w);

    }
}
