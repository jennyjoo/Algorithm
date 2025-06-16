import java.util.*;

class Solution {
    
    static Set<Integer> set;
    static boolean[] visited;
    static int[] numbers;
    static int N;
    
    private void backtracking(int depth, int start){
        if(depth == 0){
            int sum = 0;
            for(int i = 0; i < N; i++){
                if(visited[i]) sum += this.numbers[i];
            }
            set.add(sum);
        }
        else{
            for(int i = start; i < N; i++){
                if(visited[i]) continue;
                visited[i] = true;
                backtracking(depth - 1, i + 1);
                visited[i] = false;
            }
        }
    }
    public int[] solution(int[] numbers) {
        int[] answer = {};
        
        set = new HashSet<>();
        N = numbers.length;
        visited = new boolean[N];
        this.numbers = numbers;
        
        backtracking(2, 0);
    
        List<Integer> list = new ArrayList<>(set);
        list.sort((a, b) -> {return Integer.compare(a, b);});
        return answer = list.stream().mapToInt(i -> i).toArray();
    }
}