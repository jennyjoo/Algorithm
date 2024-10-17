import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static int r, c;
    static int answer = -1;
    private void recursive(int x, int y, int start, int pwdNum){
        if(x <= c && c < x + pwdNum && y <= r && r < y + pwdNum){
            if(x == c && y == r){
                answer = start;
                return;
            }

            int half = pwdNum/2;

            int cnt = 0;
            for(int i = y; i <= y + half; i += half){
                for(int j = x; j <= x + half; j+=half){
                    recursive(j, i, start + half*half*(cnt++), half);
                }
            }
        }
        else{
            return;
        }
    }
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());


        T.recursive(0,0,0,(int)Math.pow(2, N));
        System.out.println(answer);

    }


}
