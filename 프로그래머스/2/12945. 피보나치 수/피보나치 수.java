class Solution {
    static long[] dp;
    private long dynamic(int target){
        if(target <= 1) return target;
        if(dp[target] != 0 ){
            return dp[target];
        }
        else{
            dp[target] = (dynamic(target - 1) + dynamic(target - 2))%1234567;
            return dp[target];
        }
    }
    public int solution(int n) {
        int answer = 0;
        
        dp = new long[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        
        return (int)(dynamic(n) % 1234567);
    }
}