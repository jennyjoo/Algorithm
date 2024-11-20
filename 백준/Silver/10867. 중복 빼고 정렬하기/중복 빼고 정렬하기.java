import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int num = Integer.parseInt(br.readLine());

        boolean[] flagPos = new boolean[1001];
        boolean[] flagNeg = new boolean[1001];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < num; i++){
            int input = Integer.parseInt(st.nextToken());
            if(input > 0){
                if(!flagPos[input]) flagPos[input] = true;
            }
            else{
                if(!flagNeg[-input]) flagNeg[-input] = true;
            }
        }


        for(int i = flagNeg.length - 1; i >= 0; i--){
            if(flagNeg[i]) sb.append(-i).append(" ");
        }
        for(int i = 1; i <=flagPos.length - 1; i++){
            if(flagPos[i]) sb.append(i).append(" ");
        }

        System.out.println(sb.toString().trim());
    }
}