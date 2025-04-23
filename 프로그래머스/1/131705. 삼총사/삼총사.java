class Solution {
    static boolean[] visited;
    static int[] numbers;
    static int answer = 0;
    static int N;
    private void backtracking(int depth, int start){
        if(depth == 0){
            if(isZero()) this.answer++;
        }
        
        for(int i = start; i < N; i++){
            if(visited[i]) continue;
            visited[i] = true;
            backtracking(depth-1, i + 1);
            visited[i] = false;
        }
    }
    
    private boolean isZero(){
        int sum = 0;
        for(int i = 0; i < N; i++){
            if(visited[i]) sum += this.numbers[i];
        }
        
        System.out.println("return : " + (sum == 0 ? true : false));
        
        return sum == 0 ? true : false;
    }
    public int solution(int[] number) {
        
        this.numbers = number;
        this.N = number.length;
        this.visited = new boolean[this.N];
        
        backtracking(3, 0);
        return this.answer;
    }
}