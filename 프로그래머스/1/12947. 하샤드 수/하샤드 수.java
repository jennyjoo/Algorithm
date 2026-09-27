class Solution {
        

    
    public boolean solution(int x) {
        
        char[] numbers = String.valueOf(x).toCharArray();
        
        int sum = 0;
        for (char c : numbers) {
            sum += c - '0';
        }
                
        return x % sum == 0 
            ? true 
            : false;
    }
}