import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i : arr){
            if(stack.isEmpty()) {
                stack.push(i);
                continue;
            }
            if(stack.peek() == i) continue;
            
            stack.push(i);
        }
        
        Queue<Integer> queue = new LinkedList<>(stack);
        int size = queue.size();

        answer = new int[size];
        for(int i = 0; i < size; i++){
            answer[i] = queue.poll();
        }
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}