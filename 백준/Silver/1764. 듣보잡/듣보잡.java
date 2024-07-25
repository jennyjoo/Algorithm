import java.io.*;
import java.util.*;

public class Main {




    public String[] solution(String[] neverHeard, String[] neverSeen){
        List<String> names = new ArrayList<>();

        Set<String> set = new HashSet<>(List.of(neverHeard));
        for(String seen : neverSeen){
            if(set.contains(seen)) names.add(seen);
        }

        Collections.sort(names);

        return names.toArray(new String[names.size()]);
    }



    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] neverHeard = new String[n];
        String[] neverSeen = new String[m];

        for(int i = 0; i < neverHeard.length; neverHeard[i] = br.readLine(), i++){}
        for(int i = 0; i < neverSeen.length; neverSeen[i] = br.readLine(), i++){}


//        System.out.println(T.solution(neverHeard, neverSeen));
        String[] res = T.solution(neverHeard, neverSeen);
        System.out.println(res.length);
        Arrays.stream(res).forEach(o->System.out.println(o));

    }
}
