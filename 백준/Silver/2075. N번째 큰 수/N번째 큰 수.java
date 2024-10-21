import java.io.*;
import java.sql.Array;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i <N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j = 0; j < N; j++){
                list.add(Integer.parseInt(st.nextToken()));
            }
        }

        list.sort((o1, o2) -> Integer.compare(o2, o1));
        System.out.println(list.get(N-1));

    }
}