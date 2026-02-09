import java.io.*;
import java.util.*;

public class Main {

    private List<String> check(Set<String> neverHeard, String[] neverSeen) {
        List<String> names = new ArrayList<>();
        for(String name : neverSeen) {
            if (neverHeard.contains(name)) {
                names.add(name);
            }
        }
        return names;
    }


    public static void main(String[] args) throws IOException {

        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<String> neverHeard = new HashSet<>();
        String[] neverSeen = new String[M];

        // 듣도 못한
        for (int i = 0; i < N; i++) {
            neverHeard.add(br.readLine());
        }

        // 보도 못한
        for(int i  =0; i < M; i++) {
            neverSeen[i] = br.readLine();
        }


        // 결과
        List<String> result = T.check(neverHeard, neverSeen);
        result.sort(String::compareTo); // 정렬

        sb.append(result.size()).append("\n");
        for (String s : result) {
            sb.append(s).append("\n");
        }

        // 출력
        System.out.println(sb.toString());
    }
}
