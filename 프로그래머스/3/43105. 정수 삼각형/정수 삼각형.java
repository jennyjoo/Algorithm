import java.util.*;

class Solution {
    
    private static int[][] dp;
    private static int[][] TRIANGLE;
    private int max(int x, int y) {
        
        if (y == TRIANGLE.length) return 0;
        
        // memoization
        if (dp[y][x] != -1) return dp[y][x];
        
        return dp[y][x] = TRIANGLE[y][x] + Math.max(
            max(x, y+1),
            max(x+1, y+1)
        );
    }
    
    public int solution(int[][] triangle) {
        
        this.dp = new int[501][501];
        this.TRIANGLE = triangle;
        
        // init
        for(int[] row : this.dp) {
            Arrays.fill(row, -1);
        }
        
        
        return max(0, 0);
    }
}