class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        int walletH = Math.max(wallet[0], wallet[1]);
        int walletW = Math.min(wallet[0], wallet[1]);
        
        while (true) {
            int longer = Math.max(bill[0], bill[1]);
            int shorter = Math.min(bill[0], bill[1]);
            
            
            if (
                shorter <= walletH && longer <= walletW
                || shorter <= walletW && longer <= walletH
            )
            { 
                break; 
            }
                
            
            int half = longer / 2;

            answer++;
            bill[0] = shorter;
            bill[1] = half;

        }
        
        return answer;
    }
}