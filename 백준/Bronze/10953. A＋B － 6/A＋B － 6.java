import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int trial = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for(int i = 0; i < trial; i++){
            st = new StringTokenizer(br.readLine(), ", ");
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())).append("\n");
        }

        System.out.println(sb.toString().trim());
    }
}