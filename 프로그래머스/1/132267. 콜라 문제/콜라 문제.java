class Solution {
    
    static int UNIT;
    static int EXCHANGE;
    
    private int recursive(int sum, int current) {
        if (current < UNIT) return 0;
        
        int left = current % UNIT;
        int take = current / UNIT * EXCHANGE;
                
        return take + recursive(sum + take, left + take);
    }
    
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        if (n < a) return answer;
        
        this.UNIT = a;
        this.EXCHANGE = b;
        
        answer = recursive(a, n);
        

        return answer;
    }
}