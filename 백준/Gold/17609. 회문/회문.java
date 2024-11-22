import java.util.*;
import java.io.*;

public class Main {


    private int solution(char[] chars, int start, int end, int cnt){
        if(cnt >= 2) return 2;
        while(start >= 0 && end < chars.length && start < end){
            if(chars[start] == chars[end]){
                start++; end--;
            }
            else{
                int case1 = solution(chars, start + 1, end, cnt + 1);
                int case2 = solution(chars, start, end - 1, cnt + 1);

                if(case1 == 0 || case2 == 0) return 0;
                if(case1 == 1 || case2 == 1) return 1;
                return 2;
            }
        }

        return cnt == 1 ? 1 : 0;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st;

        int trial = Integer.parseInt(br.readLine());
        for(int i = 0; i < trial; i++){
            char[] chars = br.readLine().toCharArray();
            sb.append(T.solution(chars, 0, chars.length - 1, 0)).append("\n");
        }

        System.out.println(sb.toString().trim());

    }
}