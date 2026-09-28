class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        
        for (
            int i = 0;
            i < absolutes.length;
            // 증감식 순서 중요
            answer += signs[i] ? absolutes[i] : -absolutes[i], i++
        ){ }
        
        return answer;
    }
}