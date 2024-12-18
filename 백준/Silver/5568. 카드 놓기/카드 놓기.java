import java.util.*;
import java.io.*;

public class Main {

    static Set<Integer> set = new HashSet<>();
//    static String out;
    static String[] arr;
    static boolean[] visited;

    static int n, k;

    public void backtracking(int depth, String out){

        if (depth == 0) {
            int num = Integer.parseInt(out);
            if(!set.contains(num)){
                set.add(num);
            }
            return;
        }

        for(int i = 0; i < n; i++){
            if(visited[i]) continue; // 중복 순열아니고 그냥 순열, visited 있으니까
            visited[i] = true;
            backtracking(depth-1, out.concat(arr[i]));
            visited[i] = false;
        }

    }
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        n = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());

        visited = new boolean[n];
        arr = new String[n];
        for(int i = 0; i < n; i++){
            arr[i] = br.readLine();
        }

        T.backtracking(k, "");

        System.out.println(set.size());




    }
}