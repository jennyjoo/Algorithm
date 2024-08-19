import java.io.*;
import java.util.*;


public class Main {

    static boolean[] visited;
    static int ans;
    static List<List<Integer>> list;

    public int BFS(int start){
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        visited[start] = true;

        while(!q.isEmpty()){
            int curr = q.poll();
            ans++;

            List<Integer> children = list.get(curr);
            for(Integer child : children){
                if(!visited[child]){
                    visited[child] = true;
                    q.offer(child);
                }
            }
        }

        return ans-1;
    }

    public int solution(int computers, int[][] networks){
        int answer = 0;

        ans = 0;
        visited = new boolean[computers + 1];

        list = new ArrayList<>();
        for(int i = 0; i <= computers; i++){
            list.add(new ArrayList<>());
        }

        for(int[] net : networks){
            list.get(net[0]).add(net[1]);
            list.get(net[1]).add(net[0]);
        }

        answer = BFS(1);


        return answer;
    }



    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int computers = Integer.parseInt(br.readLine());
        int networksN = Integer.parseInt(br.readLine());

        int[][] networks = new int[networksN][2];

        for(int i = 0; i < networksN; i++){
            String[] input = br.readLine().split(" ");
            networks[i][0] = Integer.parseInt(input[0]);
            networks[i][1] = Integer.parseInt(input[1]);
        }

        System.out.println(T.solution(computers, networks));
    }
}
