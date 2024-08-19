import java.io.*;
import java.util.*;


public class Main {


    public int solution(int N){
        int answer = 0;

        for(int B = 1; B <= 500; B++){
            double a = Math.sqrt(B*B + N);
            if((a - (int)a) == 0) answer++;
        }

        return answer;
    }
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());


        System.out.println(T.solution(N));

    }
}
