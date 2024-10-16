import java.awt.color.ICC_ColorSpace;
import java.io.*;
import java.util.*;

public class Main {


    static int k;
    static int[] s;

    static boolean[] visited;

    static List<String> ans = new ArrayList<>();


    private void DFS(int depth, int start){
        if(depth == 0){
            String str = "";
            for(int i = 0; i < visited.length; i++){
                if(visited[i]) str += s[i] + " ";
            }
            ans.add(str);
            return;
        }

        for(int i = start; i < visited.length; i++){
            if(!visited[i]){
                visited[i] = true;
                DFS(depth-1, i + 1);
                visited[i] = false;
            }
        }

    }

    private List<String> solution(){
        ans.clear();
        DFS(6, 0);
        return ans;
    }
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();


        String input = " 1";
        while((input = br.readLine()) != null && !input.isEmpty()){
            StringTokenizer st = new StringTokenizer(input);
            k = Integer.parseInt(st.nextToken());
            if(k == 0) return;

            visited = new boolean[k];
            s = new int[k];
            for(int i = 0; i < k; i++){
                s[i] = Integer.parseInt(st.nextToken());
            }

            List<String> ret = T.solution();
            for(String str : ret) {
                System.out.println(str);
            }
            System.out.println();
        }



    }


}
