import java.util.*;
import java.io.*;

public class Main {
    static int[] out;
    static List<Integer> answer = new ArrayList<>();
    private boolean isPrime(int n){
        if(n == 1) return false;
        if(n == 2) return true;
        for(int i = 2; i <= (int)Math.sqrt(n); i++){
            if(n % i == 0) return false;
        }

        return true;
    }

    private void backtracking(int depth, int n){
        if(depth == n){
            int output = 0;
            for(int i = 0; i < n; i++){
                output *= 10;
                output += out[i];
                if(!isPrime(output)) return;
            }

            answer.add(output);

            return;
        }

        for(int i = depth == 0 ? 1 : 0; i < 10; i++){
            out[depth] = i;
            backtracking(depth + 1, n);
        }


    }

    public static void main(String[] args) throws IOException{
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        int N = Integer.parseInt(br.readLine());
        out = new int[N];

        T.backtracking(0, N);

        for(int i : answer){
            sb.append(i + "\n");
        }

        System.out.println(sb.toString());


    }


}