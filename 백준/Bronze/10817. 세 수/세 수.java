import java.io.*;
import java.util.*;

//https://www.acmicpc.net/problem/13023
public class Main {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] num = new int[3];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i < 3; i++){
            num[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(num);

        sb.append(num[1]);

        System.out.println(sb.toString());
    }

}
