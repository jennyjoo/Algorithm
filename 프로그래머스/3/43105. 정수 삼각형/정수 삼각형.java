import java.util.*;

class Solution {
    
    private static int[][] dp;
    
    // 호출 순서 의미의 bottom-up
    // 정말로 삼각형 bottom 부터 top 까지 <-- 지금 방식
    // top-down 재귀 방식 (방금 방식)
    
    public int solution(int[][] triangle) {
        
        int len = triangle.length;
        this.dp = new int[len + 1][len + 1];
        
        for (int i = 1; i <= len; i++) {
            dp[len][i] = triangle[len-1][i-1];
        }
        
        // bottom up
        for (int i = len - 1; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                dp[i][j] += 
                    triangle[i-1][j-1] 
                    + Math.max(dp[i + 1][j], dp[i+1][j + 1]);
            }
        }
        
        
        
        return dp[1][1];
    }
}