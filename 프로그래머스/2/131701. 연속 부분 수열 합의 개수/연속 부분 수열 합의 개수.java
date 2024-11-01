import java.util.*;

class Solution {
    
    public int solution(int[] elements) {
        int answer = 0;
        
        Set<Integer> set = new HashSet<>();
        
        int window = 1;
        for(int win = 1; win <= elements.length; win++){
            for(int l =0; l < elements.length; l++){
                int sum = 0;
                for(int i = l; i < l + win; i++){
                    int idx = i;
                    if(idx >= elements.length){
                        idx %= elements.length;
                    }
                    sum += elements[idx];
                }
                set.add(sum);
            }
        }
        
        
        return set.size();
    
    }
}