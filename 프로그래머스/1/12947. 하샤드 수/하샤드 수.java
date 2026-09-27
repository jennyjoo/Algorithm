class Solution {
    
    static int sum = 0;
    
    public int recursive (int number) {
        if (number == 0) return 0;
        else {
            sum += number % 10;
            return recursive(number/10);
        }
    }
    
    public boolean solution(int x) {
        boolean answer = true;
        
        recursive(x);
        
        float q = (float) x / sum;
        float del = q - (x / sum);
        
        return del == 0.0 ? true: false;
    }
}