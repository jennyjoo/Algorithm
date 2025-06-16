import java.util.*;
class Solution {
    static boolean[] isPrime;
    static boolean[] visited;
    static int[] nums;
    static int answ = 0;
    private void getPrimeNumbers(){
        for(int i = 2; i < (int)Math.sqrt(isPrime.length); i++){
            if(!isPrime[i]) continue;
            for(int j = i + 1; j < isPrime.length; j++){
                if(j % i == 0) isPrime[j] = false;
            }
        }
    }
    
    private void backtracking(int depth, int start){
        if(depth == 0){
            int sum = 0;
            for(int i = 0; i < visited.length; i++){
                if(visited[i]) sum += this.nums[i];
            }
            if(isPrime[sum]){
                answ++;
            }
        }
        else {
            for(int i = start; i < visited.length; i++){
                if(visited[i]) continue;
                visited[i] = true;
                backtracking(depth - 1, i + 1);
                visited[i] = false;
            }
        }
    }
    public int solution(int[] nums) {
        int answer = -1;
        
        this.nums = nums;
        visited = new boolean[nums.length];
        isPrime = new boolean[50001];
        Arrays.fill(isPrime, true);
        
        getPrimeNumbers();
        backtracking(3, 0);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.

        return answ;
    }
}