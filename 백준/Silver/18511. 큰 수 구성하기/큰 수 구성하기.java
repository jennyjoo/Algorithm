import java.awt.color.ICC_ColorSpace;
import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static int[] K;
    static int[] out;
    static int answer = Integer.MIN_VALUE;

    private void recursive(int depth, int r){
        if(depth == r){
            int num = out[out.length-1];

            for(int i = out.length - 2; i >= 0; i--){
                num = num * 10;
                num += out[i];
            }

            if(num <= N) answer = Math.max(answer, num);
            return;
        }

        for(int i = 0; i < K.length; i++){
            out[depth] = K[i];
            recursive(depth+1, r);
        }
    }

    private int solution(){
        for(int i = 1; i <= String.valueOf(N).length(); i++){
            out = new int[i];
            recursive(0, i);
        }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        int kSize = Integer.parseInt(st.nextToken());

        K = new int[kSize];

        String[] str = br.readLine().split(" ");
        for(int i = 0; i < kSize; i++){
            K[i] = Integer.parseInt(str[i]);
        }

        Arrays.sort(K);

        System.out.println(T.solution());

    }


}
