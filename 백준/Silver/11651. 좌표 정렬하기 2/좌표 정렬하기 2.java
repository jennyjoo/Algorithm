import java.util.*;
import java.io.*;

public class Main {

    static List<int[]> list;
    public static void main(String[] args) throws IOException{
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        list = new ArrayList<>();

        for(int i = 0;i < N; i++){
            int[] point = new int[2];
            st = new StringTokenizer(br.readLine());
            point[0] = Integer.parseInt(st.nextToken());
            point[1] = Integer.parseInt(st.nextToken());

            list.add(Arrays.copyOf(point, 2));
        }


        list.sort((o1, o2) -> {
            if(o1[1] == o2[1])return Integer.compare(o1[0], o2[0]);
            return Integer.compare(o1[1], o2[1]);
        });

        StringBuilder sb = new StringBuilder();
        for(int[] po : list){
            sb.append(po[0]).append(" ").append(po[1]).append("\n");
        }
        System.out.println(sb.toString());

    }

}