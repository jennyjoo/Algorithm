import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int wmax = 0;
        int hmax = 0;
        for(int[] size : sizes){
            Arrays.sort(size);
            wmax = Math.max(wmax, size[0]);
            hmax = Math.max(hmax, size[1]);
        }
        
        
        return answer = hmax * wmax;
    }
}