import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        List<Double> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            double input = Integer.parseInt(st.nextToken());
            list.add(input);
        }
        list.sort(Double::compare);

        double sum = 0;
        for(int i = 0; i < n - 1; i++){
            double out = list.get(i) / 2;
            sum += out;
        }

        sum += list.get(n-1);
        System.out.println(sum);


    }
}