import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = {};
        
        answer = new int[commands.length] ;
        int index = 0;
        
        for(int[] command : commands){
            List<Integer> list = new ArrayList<>();
            int i = command[0];
            int j = command[1];
            int k = command[2];
            for(int l = i - 1; l <= j - 1; l++){
                list.add(array[l]);
            }
            
            list.sort((a, b) -> {return Integer.compare(a, b);});
            
            answer[index++] = list.get(k-1);
        }
        return answer;
    }
}