class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        char[] chars = sb.reverse().toString().toCharArray();
        
        answer = new int[chars.length];
        for(int i = 0; i < answer.length; i++){
            answer[i] = chars[i] - '0';
        }
        return answer;
    }
}