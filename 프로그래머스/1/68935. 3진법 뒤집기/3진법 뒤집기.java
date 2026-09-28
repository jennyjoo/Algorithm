import java.util.*;

class Solution {
    
    
    public int solution(int n) {
        int answer = 0;
        
        String ternary = Integer.toString(n, 3);
        String reversed = new StringBuilder(ternary)
                                    .reverse()
                                    .toString();
        
        int decimal = Integer.parseInt(reversed, 3);
        return decimal;
    }
}