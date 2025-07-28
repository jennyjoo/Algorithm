import java.util.*;

class Solution {
    private static boolean[] isPrime;
    private static Set<Integer> numberSet;
    private static int[] nums;
    private static boolean[] visited;
    private static int[] out;
    
    private void backtracking(int depth, int bound){
        if(depth == bound){
            String str = "";
            for(int i = 0; i < out.length; i++){
                str += out[i] + "";
            }
            numberSet.add(Integer.parseInt(str));
            
        }else{
            for(int i = 0; i < nums.length; i++){
                if(visited[i]) continue;
                visited[i] = true;
                out[depth] = nums[i];
                backtracking(depth + 1, bound);
                visited[i] = false;
            }
        }
        
    }
    
    private void setIsPrime(int n){
        
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        
        for(int i = 2; i <= n; i++){
            if(!isPrime[i]) continue;
            for(int j = i * 2; j <= n; j += i){
                isPrime[j] = false;
            }
        }
    }
    public int solution(String numbers) {
        int answer = 0;
        
        numberSet = new HashSet<>();
        nums = new int[numbers.length()];
        visited = new boolean[numbers.length()];
        int index = 0;
        for(char c : numbers.toCharArray()){
            nums[index++] = c - '0';
        }
        
        for(int i = 1; i <= numbers.length(); i++){
            out = new int[i];
            backtracking(0, i);
        }
        
        List<Integer> numberList = new ArrayList<>(numberSet);
        numberList.sort(Integer::compare);
        
        int maxNumber = numberList.get(numberList.size() - 1);
        isPrime = new boolean[maxNumber + 1];
        
        setIsPrime(maxNumber);
        
        for(Integer i : numberList){
            if(isPrime[i]) answer++;
        }
        
        return answer;
    }
}