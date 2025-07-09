import java.util.*;

class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < food.length; i++){
            int n = food[i]/2;
            sb.append(String.valueOf(i).repeat(n));
        }
        
        answer = sb.toString().concat("0").concat(sb.reverse().toString());
        
        return answer;
    }
}