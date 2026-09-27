class Solution {
        
    public int recursiveSum (int number) {
        // 이미 0인 상태로 넘어온 값 판별, 판별은 부모가 하지 않고 넘겨받은 자식이
        if (number == 0) return 0;
        
        // a(n+1) = a(n) + k
        return (number % 10) + recursiveSum(number / 10);
    }
    
    public boolean solution(int x) {
        
        int sum = recursiveSum(x);
        
        return x % sum == 0 ? true : false;
    }
}