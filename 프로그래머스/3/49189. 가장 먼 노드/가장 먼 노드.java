import java.util.*;

class Solution {
    
    static List<List<Integer>> list;
    static boolean[] visited;
    static int[] distance;
    
    static int MAX = Integer.MIN_VALUE;
 
    private int BFS(int root){
        Queue<Integer> q = new LinkedList<>();
        
        q.offer(root);
        visited[root] = true;
        
        distance[1] = 0;
        while(!q.isEmpty()){
            
            int curr = q.poll();
            
            List<Integer> li = list.get(curr);
            for(int i = 0;i < li.size(); i++){
                if(!visited[li.get(i)]){
                    visited[li.get(i)] = true;
                    q.offer(li.get(i));
                    distance[li.get(i)] = distance[curr] + 1;
                    MAX = Math.max(MAX, distance[li.get(i)]);
                }
            }
        }
        
        int cnt = 0;
        for(int i = 1; i < distance.length; i++){
            if(distance[i] == MAX){
                cnt += 1;
            }
        }
        
        return cnt;
        
        
    }
    
    public int solution(int n, int[][] edge) {
        int answer = 0;
        
        distance = new int[n + 1];
        visited = new boolean[n + 1];
        list = new ArrayList<>();
        for(int i = 0; i <= n; i++){
            list.add(new ArrayList<>());
        }
        
        for(int[] p : edge){
            list.get(p[0]).add(p[1]);
            list.get(p[1]).add(p[0]);
        }
        
        
    
        return BFS(1);
    }
}