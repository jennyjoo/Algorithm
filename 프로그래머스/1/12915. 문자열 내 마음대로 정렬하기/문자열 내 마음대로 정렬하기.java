import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        
        Arrays.sort(strings, (a, b) -> {
            int A = a.charAt(n);
            int B = b.charAt(n);
            if(A == B){
                return a.compareTo(b);
            }
            return Integer.compare(a.charAt(n), b.charAt(n));
        });
        
        
        return strings;
    }
}