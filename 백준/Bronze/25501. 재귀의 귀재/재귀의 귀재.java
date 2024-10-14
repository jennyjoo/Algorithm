import java.io.*;
import java.util.*;

public class Main {

    static int count=1;
    private int recursion(String str, int l, int r, int cnt){
        if(l >= r) { count = cnt + 1; return 1;}
        else if(str.charAt(l) != str.charAt(r)) {count = cnt + 1; return 0;}
        else{
            return recursion(str, l + 1, r - 1, cnt + 1);
        }
    }
    private int solution(String str){
        return recursion(str, 0, str.length() - 1, 0);
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        for(int i = 0; i < N; i++){
            String input = br.readLine();
            sb.append(T.solution(input)).append(" ").append(count).append("\n");
        }

        System.out.println(sb.toString());
    }


}
