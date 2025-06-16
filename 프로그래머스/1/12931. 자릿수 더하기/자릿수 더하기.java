import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        int d = 10;
        while(n > 0){
            answer += n%d;
            n /= d;
        }

        return answer;
    }
}