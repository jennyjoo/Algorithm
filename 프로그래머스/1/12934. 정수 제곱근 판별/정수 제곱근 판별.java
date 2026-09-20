class Solution {
    
    private boolean isInt(Number number) {
        
        double sqrt = Math.sqrt((double) number);
        int intValue = (int) sqrt;
        
        return sqrt - intValue > 0 ? false : true;
    }
    
    public long solution(long n) {
        long answer = 0;
        long sqrt = 0;
        
        if (isInt((double) n)) {
            sqrt = (long) Math.sqrt(n);
            answer = (long) Math.pow(sqrt + 1 , 2);
        }
        else {
            answer = -1;
        }
        
        return answer;
    }
}