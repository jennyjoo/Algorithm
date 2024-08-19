import java.io.*;
import java.util.*;


public class Main {


    public int solution(int N){
        int answer = 0;

        int na; // yo + 2;
        int yo;
        int ta; // even

        for(yo = 1; yo < N-3; yo++){
            for(na = yo + 2; na < N-1; na++){
                ta = N - yo - na;
                if(ta%2 == 0){
                    if(ta > 0 && na > 0 && yo > 0) answer++;
                }
            }
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
