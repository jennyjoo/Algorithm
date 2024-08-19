import java.io.*;
import java.util.*;


public class Main {


    public int solution(int N, int M, int K){
        int answer = 0;
        for(int i = 0; i <= K; i++){
            int female = (N - i)/2;
            int male = M - (K-i);

            int team = Math.min(female, male);
            answer = Math.max(answer, team);
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());



        System.out.println(T.solution(N, M, K));

    }
}
