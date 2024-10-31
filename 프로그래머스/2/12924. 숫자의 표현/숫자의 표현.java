class Solution {

    public int solution(int n) {
        int answer = 0;
        
        int lt = 1;
        int rt = lt;
        int sum = 0;
        
        while(lt <= n){
            while(sum < n){
                sum += rt++;
                
            }

            if(sum == n){
                answer += 1;
            }
            
            sum -= lt;
            lt += 1;
        }
        
        return answer;
    }
}