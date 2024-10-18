import java.io.*;
import java.util.*;

public class Main {


    private int solution(int N){
        char[] chars = String.valueOf(N).toCharArray();
        Arrays.sort(chars);
        String str = new StringBuilder(String.copyValueOf(chars)).reverse().toString();


        return Integer.parseInt(str) ;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        int N = Integer.parseInt(br.readLine());

        System.out.println(T.solution(N));
    }


}