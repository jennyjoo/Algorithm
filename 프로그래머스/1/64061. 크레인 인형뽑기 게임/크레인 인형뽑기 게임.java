import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        
        Stack<Integer> st = new Stack<>();
        for(int move : moves){
            int number = 0;
            for(int i = 0; i < board.length; i++){
                if(board[i][move-1] != 0){
                    number = board[i][move-1];
                    board[i][move-1] = 0;
                    break;
                }
            }
            
            if(number == 0) continue;
            
            if(st.isEmpty()){
                st.push(number);
            }
            else if( st.peek() != number){
                st.push(number);
            }
            else {
                st.pop();
                answer += 2;
            }
        }
        
        return answer;
    }
}