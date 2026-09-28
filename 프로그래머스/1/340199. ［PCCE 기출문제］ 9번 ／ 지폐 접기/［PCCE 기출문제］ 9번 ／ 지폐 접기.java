class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        
        int walletH = Math.max(wallet[0], wallet[1]);
        int walletW = Math.min(wallet[0], wallet[1]);
        
        
        while (Math.max(bill[1], bill[0]) > walletH || Math.min(bill[1], bill[0]) > walletW) {
            int index = bill[0]  > bill[1] ? 0 : 1;
            bill[index] = bill[index] / 2;
            
            answer++;

        }
        
        return answer;
    }
}