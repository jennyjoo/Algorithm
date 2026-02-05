import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        while (true) {
            int N = Integer.parseInt(br.readLine());
            if (N == 0) break;

            double maxHeight = -1.0;
            List<String> stdHeights = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                double height = Double.parseDouble(st.nextToken());

                if (height > maxHeight) {
                    maxHeight = height;
                    stdHeights.clear();
                    stdHeights.add(name);
                } 
                else if (height == maxHeight) {
                    stdHeights.add(name);
                }
            }

            for (String name : stdHeights) {
                sb.append(name).append(" ");
            }
            sb.append("\n");
        }
        
        System.out.print(sb);
    }
}