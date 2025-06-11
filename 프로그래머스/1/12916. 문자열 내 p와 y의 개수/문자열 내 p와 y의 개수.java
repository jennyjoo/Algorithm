import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int ycount = s.toLowerCase().replaceAll("p", "").length();
        int pcount = s.toLowerCase().replaceAll("y", "").length();
    
        return answer = ycount == pcount;
    }
}