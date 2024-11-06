import java.util.*;

class Solution
{
   
    public int solution(String s)
    {
        int answer = -1;

        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray()){
            if(stack.isEmpty()){
                stack.push(c);
                continue;
            }
            
            if(stack.peek() == c){
                stack.pop();
            }
            else{
                stack.push(c);
            }
        }

        return stack.size() == 0 ? 1 : 0;
    }
}