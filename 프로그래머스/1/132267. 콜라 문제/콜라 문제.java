class Solution {
    
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        if (n < a) return answer;
        
        while (n >= a) {
            int exchange = n / a * b;
            answer += exchange;
            n = n % a + exchange;
        }
        
        return answer;
    }
}