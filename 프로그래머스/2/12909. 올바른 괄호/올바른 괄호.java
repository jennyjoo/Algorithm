import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;

        char[] chars = s.toCharArray();
        if(chars[0] == ')') return false;
        
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < chars.length; i++){

            if(chars[i] == '('){
                stack.push(chars[i]);
            }
            else{
                if(stack.isEmpty()) return false;
                stack.pop();
            }
        }

        return stack.isEmpty() ? true : false;
    }
}