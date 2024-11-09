import java.util.*;
import java.io.*;

public class Main {
    static boolean[] visited;
    static int N, K;

    static List<String> strs;
    static int max = 0;

    private void backtracking(int depth, int start){
        if(depth == K - 5){
            int count = 0;

            for(String s : strs){
                boolean flag = true;
                for(int i = 0; i < s.length(); i++){
                    int index = s.charAt(i) - 'a';
                    if(!visited[index]){
                        flag = false;
                        break;
                    }
                }

                if(flag) count++;
            }

            max = (int)Math.max(max, count);
            return;
        }

        for(int i = start; i < 26; i++){
            if(visited[i]) continue;
            visited[i] = true;
            backtracking(depth + 1, i + 1);
            visited[i] = false;
        }
    }
    public static void main(String[] args) throws IOException{
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());



        visited = new boolean[26];
        strs = new ArrayList<>();

        for(int i = 0; i < N; i++){
            String input = br.readLine();
            int start = 4;
            int end = input.lastIndexOf("tica");

            strs.add(input.substring(start, end));
        }

        String str = "antic";
        for(char c : str.toCharArray()){
            visited[c - 'a'] = true;
        }

        if(K < 5){
            System.out.println(0);
            return;
        }

        T.backtracking(0, 0);
        System.out.println(max);


    }


}