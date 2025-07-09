import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        
        List<Stack<Integer>> list = new ArrayList<>();
        
        for(int col = 0; col < board[0].length; col++){
            Stack<Integer> st = new Stack<>();
            for(int row = board.length-1; row >= 0; row--){
                if(board[row][col] != 0){
                    st.push(board[row][col]);
                }
            }
            list.add(st);
        }
        
        Stack<Integer> st = new Stack<>();
        for(int move : moves){
            Stack<Integer> s = list.get(move - 1);
            if(s.isEmpty()) continue;
            int out = s.pop();
            
            if(st.isEmpty()){
                st.push(out);
            }
            else if( st.peek() != out){
                st.push(out);
            }
            else {
                st.pop();
                answer += 2;
            }
        }
        
        return answer;
    }
}