import java.io.*;
import java.util.*;

public class Main {


    private String recursive(String s, int size){
        if(s.length() <= 1) return s;

        return recursive(s.substring(0, size/3), size/3)
                + " ".repeat(size/3)
                + recursive(s.substring((size/3)*2), size/3);
    }

    private void solution(int n){
        String str = "-".repeat((int)Math.pow(3, n));
        String answer = recursive(str, str.length());

        System.out.println(answer);
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       String input;
        while((input = br.readLine()) != null && !input.isEmpty()){
            int in = Integer.parseInt(input);
            T.solution(in);
        }
    }


}
