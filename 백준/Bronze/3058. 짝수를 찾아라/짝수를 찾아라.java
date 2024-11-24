import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int trial = Integer.parseInt(br.readLine());
        for(int i = 0; i < trial; i++){
            int[] arr = new int[7];
            StringTokenizer st = new StringTokenizer(br.readLine());
            int min = 101;
            int sum = 0;
            for(int j = 0; j < 7; j++){
                arr[j] = Integer.parseInt(st.nextToken());
                if(arr[j]%2 == 0){
                    sum += arr[j];
                    if(arr[j] < min) min = arr[j];
                }

            }

            sb.append(sum).append(" ").append(min).append("\n");
        }

        System.out.println(sb.toString().trim());


    }
}