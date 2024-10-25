import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main {

    private boolean solution(String str){
        boolean[] flag = new boolean[26];

        char[] chars = str.toLowerCase().toCharArray();
        for(int i = 0; i < str.length(); i++){
            int index = chars[i] - 'a';

            if(flag[index]) return false;

            while(i < chars.length){
                if((i + 1) < chars.length && chars[i] == chars[i + 1]){
                    i++;
                }else{
                    flag[index] = true;
                    break;
                }
            }
        }
        return true;
    }


    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        String[] input = new String[N];

        for(int i = 0; i < N; i++){
            input[i] = br.readLine();
        }

        int cnt = 0;
        for(int i = 0; i < N; i++){
            if(T.solution(input[i])){
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}