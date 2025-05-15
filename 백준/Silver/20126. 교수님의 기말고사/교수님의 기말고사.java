import java.util.*;
import java.io.*;

public class Main {


    static List<int[]> list;

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        list = new ArrayList<>();

        for(int i = 0; i < N; i++){
            String[] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);

            list.add(new int[]{x, y});
        }

        list.sort((a, b) -> Integer.compare(a[0], b[0]));

        if(list.get(0)[0] >= M) {
            System.out.println(0);
            return;
        }
        for(int i = 0; i < list.size() - 1; i++){
            int[] aa = list.get(i);
            int[] bb = list.get(i + 1);
            if(bb[0] - (aa[0] + aa[1]) >= M){
                System.out.println(aa[0] + aa[1]);
                return;
            }
        }

        int[] last = list.get(list.size()-1);
        if(S - (last[0] + last[1]) >= M){
            System.out.println(last[0] + last[1]);
            return;
        }


        System.out.println(-1);

    }
}