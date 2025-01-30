import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<Double> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            double input = Integer.parseInt(br.readLine());
            list.add(input);
        }
        list.sort(Double::compare);
        Collections.reverse(list);

        double sum = 0;
        for(int i = 0; i < n; i++){
            double out = list.get(i) - i;
            sum += Math.max(0, out);
        }

        System.out.println((long)sum);

    }
}