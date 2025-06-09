import java.util.*;

class Solution {
    static boolean[] isPrime;
    private void getPrime(int n){
        isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        
        for(int i = 2; i <= n; i++){
            if(!isPrime[i]) continue;
            for(int j = i * 2 ; j <= n; j += i){
                isPrime[j] = false;
            }
        }
        
        isPrime[2] = true;
        
    }
    public int solution(int n) {
        int answer = 0;
        
        getPrime(n);
        
        
        for(int i = 2; i <= n; i++){
            if(isPrime[i]) answer++;
        }
        
        return answer;
    }
}